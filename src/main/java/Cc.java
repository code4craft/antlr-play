import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author code4crafer@gmail.com
 */
public class Cc {

    public static void main(String[] args) throws IOException {
        String str = "当价格大于x时";
        CalcLexer lexer = new CalcLexer(new ANTLRInputStream(new ByteArrayInputStream(str.getBytes())));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        ParserRuleContext tree = parser.exp();
        System.out.println(tree);

    }
}
