// Generated from /Users/yihua/Downloads/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull CalcParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#比较}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit比较(@NotNull CalcParser.比较Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#条件1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit条件1(@NotNull CalcParser.条件1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#变量}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit变量(@NotNull CalcParser.变量Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#gt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(@NotNull CalcParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(@NotNull CalcParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#属性}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit属性(@NotNull CalcParser.属性Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(@NotNull CalcParser.EqContext ctx);
}