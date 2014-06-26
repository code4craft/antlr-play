// Generated from /Users/yihua/codecraft/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
package com.dianping.tuangou.transfer.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#逻辑}.
	 * @param ctx the parse tree
	 */
	void enter逻辑(@NotNull CalcParser.逻辑Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#逻辑}.
	 * @param ctx the parse tree
	 */
	void exit逻辑(@NotNull CalcParser.逻辑Context ctx);
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
	 * Enter a parse tree produced by {@link CalcParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull CalcParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull CalcParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#比较块}.
	 * @param ctx the parse tree
	 */
	void enter比较块(@NotNull CalcParser.比较块Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#比较块}.
	 * @param ctx the parse tree
	 */
	void exit比较块(@NotNull CalcParser.比较块Context ctx);
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
	 * Enter a parse tree produced by {@link CalcParser#比较块可以无属性的比较块}.
	 * @param ctx the parse tree
	 */
	void enter比较块可以无属性的比较块(@NotNull CalcParser.比较块可以无属性的比较块Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#比较块可以无属性的比较块}.
	 * @param ctx the parse tree
	 */
	void exit比较块可以无属性的比较块(@NotNull CalcParser.比较块可以无属性的比较块Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull CalcParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull CalcParser.AndContext ctx);
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
	 * Enter a parse tree produced by {@link CalcParser#ncontain}.
	 * @param ctx the parse tree
	 */
	void enterNcontain(@NotNull CalcParser.NcontainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#ncontain}.
	 * @param ctx the parse tree
	 */
	void exitNcontain(@NotNull CalcParser.NcontainContext ctx);
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
	 * Enter a parse tree produced by {@link CalcParser#contain}.
	 * @param ctx the parse tree
	 */
	void enterContain(@NotNull CalcParser.ContainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#contain}.
	 * @param ctx the parse tree
	 */
	void exitContain(@NotNull CalcParser.ContainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#ne}.
	 * @param ctx the parse tree
	 */
	void enterNe(@NotNull CalcParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#ne}.
	 * @param ctx the parse tree
	 */
	void exitNe(@NotNull CalcParser.NeContext ctx);
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