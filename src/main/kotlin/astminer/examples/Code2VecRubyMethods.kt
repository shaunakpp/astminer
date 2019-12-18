package astminer.examples

import astminer.common.*
import astminer.common.model.LabeledPathContexts
import astminer.parse.antlr.ruby.RubyMethodSplitter
import astminer.parse.antlr.ruby.RubyParser
import astminer.paths.*
import java.io.File


fun code2vecRubyMethods() {
    val folder = "./testData/code2vecPathMining"
    val outputDir = "out_examples/code2vecPathMining/ruby"

    val miner = PathMiner(PathRetrievalSettings(5, 5))

    val storage = Code2VecPathStorage(outputDir)

    File(folder).forFilesWithSuffix(".rb") { file ->
        //parse file
        val fileNode = RubyParser().parse(file.inputStream()) ?: return@forFilesWithSuffix

        //extract method nodes
        val methods = RubyMethodSplitter().splitIntoMethods(fileNode)

        methods.forEach { methodInfo ->
            val methodNameNode = methodInfo.method.nameNode ?: return@forEach
            val methodRoot = methodInfo.method.root
            val label = splitToSubtokens(methodNameNode.getToken()).joinToString("|")
            methodRoot.preOrder().forEach { it.setNormalizedToken() }
            methodNameNode.setNormalizedToken("METHOD_NAME")

            // Retrieve paths from every node individually
            val paths = miner.retrievePaths(methodRoot)
            storage.store(LabeledPathContexts(label, paths.map { toPathContext(it) { node -> node.getNormalizedToken() } }))
        }
    }

    storage.save()
}
