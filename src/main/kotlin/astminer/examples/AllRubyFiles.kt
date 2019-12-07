package astminer.examples

import astminer.common.model.LabeledPathContexts
import astminer.parse.antlr.ruby.RubyParser
import astminer.paths.PathMiner
import astminer.paths.PathRetrievalSettings
import astminer.paths.CsvPathStorage
import astminer.paths.toPathContext
import java.io.File


fun allRubyFiles() {
    val inputDir = "./testData/examples/"

    val miner = PathMiner(PathRetrievalSettings(5, 5))
    val outputDir = "out_examples/allRubyFiles"
    val storage = CsvPathStorage(outputDir)

    File(inputDir).forFilesWithSuffix(".rb") { file ->
        val node = RubyParser().parse(file.inputStream()) ?: return@forFilesWithSuffix
        val paths = miner.retrievePaths(node)

        storage.store(LabeledPathContexts(file.path, paths.map { toPathContext(it) }))
    }

    storage.save()
}
