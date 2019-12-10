package astminer.parse.antlr.ruby

import me.vovak.antlr.parser.CorundumLexer
import me.vovak.antlr.parser.CorundumParser
import astminer.common.model.Parser
import astminer.parse.antlr.SimpleNode
import astminer.parse.antlr.convertAntlrTree
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.InputStream
import java.lang.Exception

class RubyParser : Parser<SimpleNode> {
    override fun parse(content: InputStream): SimpleNode? {
        // return try {
        val lexer = CorundumLexer(CharStreams.fromStream(content))
        lexer.removeErrorListeners()
        val tokens = CommonTokenStream(lexer)
        val parser = CorundumParser(tokens)
        parser.removeErrorListeners()
        val context = parser.prog()
        return convertAntlrTree(context, CorundumParser.ruleNames, CorundumParser.VOCABULARY)
        // } catch (e: Exception) {
        // return null
        // }
    }
}