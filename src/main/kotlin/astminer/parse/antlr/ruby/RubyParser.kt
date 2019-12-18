package astminer.parse.antlr.ruby

import me.vovak.antlr.parser.RubyParser
import me.vovak.antlr.parser.RubyLexer
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
        val lexer = RubyLexer(CharStreams.fromStream(content))
        lexer.removeErrorListeners()
        val tokens = CommonTokenStream(lexer)
        val parser = RubyParser(tokens)
        parser.removeErrorListeners()
        val context = parser.compilation_unit()
        return convertAntlrTree(context, RubyParser.ruleNames, RubyParser.VOCABULARY)
        // } catch (e: Exception) {
        // return null
        // }
    }
}