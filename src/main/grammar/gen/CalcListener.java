// Generated from /Users/yihua/Downloads/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull CalcParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull CalcParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#比较}.
	 * @param ctx the parse tree
	 */
	void enter比较(@NotNull CalcParser.比较Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#比较}.
	 * @param ctx the parse tree
	 */
	void exit比较(@NotNull CalcParser.比较Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#条件1}.
	 * @param ctx the parse tree
	 */
	void enter条件1(@NotNull CalcParser.条件1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#条件1}.
	 * @param ctx the parse tree
	 */
	void exit条件1(@NotNull CalcParser.条件1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#变量}.
	 * @param ctx the parse tree
	 */
	void enter变量(@NotNull CalcParser.变量Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#变量}.
	 * @param ctx the parse tree
	 */
	void exit变量(@NotNull CalcParser.变量Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#gt}.
	 * @param ctx the parse tree
	 */
	void enterGt(@NotNull CalcParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#gt}.
	 * @param ctx the parse tree
	 */
	void exitGt(@NotNull CalcParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(@NotNull CalcParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(@NotNull CalcParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#属性}.
	 * @param ctx the parse tree
	 */
	void enter属性(@NotNull CalcParser.属性Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#属性}.
	 * @param ctx the parse tree
	 */
	void exit属性(@NotNull CalcParser.属性Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(@NotNull CalcParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(@NotNull CalcParser.EqContext ctx);
}