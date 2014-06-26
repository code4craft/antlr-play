package com.dianping.tuangou.transfer.parser;// Generated from /Users/yihua/codecraft/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
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
	 * Visit a parse tree produced by {@link CalcParser#逻辑}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit逻辑(@NotNull CalcParser.逻辑Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#比较}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit比较(@NotNull CalcParser.比较Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull CalcParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#比较块}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit比较块(@NotNull CalcParser.比较块Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#变量}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit变量(@NotNull CalcParser.变量Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(@NotNull CalcParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#比较块可以无属性的比较块}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit比较块可以无属性的比较块(@NotNull CalcParser.比较块可以无属性的比较块Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull CalcParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull CalcParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#ncontain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcontain(@NotNull CalcParser.NcontainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#条件1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visit条件1(@NotNull CalcParser.条件1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#contain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContain(@NotNull CalcParser.ContainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#ne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe(@NotNull CalcParser.NeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#gt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(@NotNull CalcParser.GtContext ctx);
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