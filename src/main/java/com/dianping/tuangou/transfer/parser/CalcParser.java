// Generated from /Users/yihua/codecraft/antlr-play/src/main/grammar/Calc.g4 by ANTLR 4.x
package com.dianping.tuangou.transfer.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, Letter=21, LetterE=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'或者'", "'是'", "'时'", "'不等于'", "'大于'", "'当'", "'<'", "'='", 
		"'包含'", "'且'", "'为'", "'>'", "'等于'", "'并且'", "'不包含'", "'或'", "'而且'", "'同时'", 
		"'小于'", "'靠近'", "Letter", "LetterE"
	};
	public static final int
		RULE_exp = 0, RULE_逻辑 = 1, RULE_and = 2, RULE_or = 3, RULE_比较块 = 4, RULE_比较块可以无属性的比较块 = 5, 
		RULE_条件1 = 6, RULE_属性 = 7, RULE_比较 = 8, RULE_gt = 9, RULE_eq = 10, RULE_lt = 11, 
		RULE_ne = 12, RULE_contain = 13, RULE_ncontain = 14, RULE_变量 = 15;
	public static final String[] ruleNames = {
		"exp", "逻辑", "and", "or", "比较块", "比较块可以无属性的比较块", "条件1", "属性", "比较", "gt", 
		"eq", "lt", "ne", "contain", "ncontain", "变量"
	};

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public 比较块可以无属性的比较块Context 比较块可以无属性的比较块(int i) {
			return getRuleContext(比较块可以无属性的比较块Context.class,i);
		}
		public TerminalNode EOF() { return getToken(CalcParser.EOF, 0); }
		public List<逻辑Context> 逻辑() {
			return getRuleContexts(逻辑Context.class);
		}
		public 比较块Context 比较块() {
			return getRuleContext(比较块Context.class,0);
		}
		public 逻辑Context 逻辑(int i) {
			return getRuleContext(逻辑Context.class,i);
		}
		public List<比较块可以无属性的比较块Context> 比较块可以无属性的比较块() {
			return getRuleContexts(比较块可以无属性的比较块Context.class);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(T__14);
			setState(33); 比较块();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__10) | (1L << T__6) | (1L << T__4) | (1L << T__3) | (1L << T__2))) != 0)) {
				{
				{
				setState(34); 逻辑();
				setState(35); 比较块可以无属性的比较块();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); match(T__17);
			setState(43); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 逻辑Context extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public 逻辑Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_逻辑; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enter逻辑(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exit逻辑(this);
		}
	}

	public final 逻辑Context 逻辑() throws RecognitionException {
		逻辑Context _localctx = new 逻辑Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_逻辑);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case T__10:
			case T__6:
			case T__3:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); and();
				}
				break;
			case T__19:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); or();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__6) | (1L << T__3) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 比较块Context extends ParserRuleContext {
		public 属性Context 属性() {
			return getRuleContext(属性Context.class,0);
		}
		public 比较Context 比较() {
			return getRuleContext(比较Context.class,0);
		}
		public 变量Context 变量() {
			return getRuleContext(变量Context.class,0);
		}
		public 比较块Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_比较块; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enter比较块(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exit比较块(this);
		}
	}

	public final 比较块Context 比较块() throws RecognitionException {
		比较块Context _localctx = new 比较块Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_比较块);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 属性();
			setState(54); 比较();
			setState(55); 变量();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 比较块可以无属性的比较块Context extends ParserRuleContext {
		public 属性Context 属性() {
			return getRuleContext(属性Context.class,0);
		}
		public 比较Context 比较() {
			return getRuleContext(比较Context.class,0);
		}
		public 变量Context 变量() {
			return getRuleContext(变量Context.class,0);
		}
		public 比较块可以无属性的比较块Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_比较块可以无属性的比较块; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enter比较块可以无属性的比较块(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exit比较块可以无属性的比较块(this);
		}
	}

	public final 比较块可以无属性的比较块Context 比较块可以无属性的比较块() throws RecognitionException {
		比较块可以无属性的比较块Context _localctx = new 比较块可以无属性的比较块Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_比较块可以无属性的比较块);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if (_la==Letter) {
				{
				setState(57); 属性();
				}
			}

			setState(60); 比较();
			setState(61); 变量();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 条件1Context extends ParserRuleContext {
		public 条件1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_条件1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enter条件1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exit条件1(this);
		}
	}

	public final 条件1Context 条件1() throws RecognitionException {
		条件1Context _localctx = new 条件1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_条件1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 属性Context extends ParserRuleContext {
		public TerminalNode Letter(int i) {
			return getToken(CalcParser.Letter, i);
		}
		public List<TerminalNode> Letter() { return getTokens(CalcParser.Letter); }
		public 属性Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_属性; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enter属性(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exit属性(this);
		}
	}

	public final 属性Context 属性() throws RecognitionException {
		属性Context _localctx = new 属性Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_属性);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65); match(Letter);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Letter );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 比较Context extends ParserRuleContext {
		public NcontainContext ncontain() {
			return getRuleContext(NcontainContext.class,0);
		}
		public NeContext ne() {
			return getRuleContext(NeContext.class,0);
		}
		public ContainContext contain() {
			return getRuleContext(ContainContext.class,0);
		}
		public GtContext gt() {
			return getRuleContext(GtContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public 比较Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_比较; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enter比较(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exit比较(this);
		}
	}

	public final 比较Context 比较() throws RecognitionException {
		比较Context _localctx = new 比较Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_比较);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case T__15:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); gt();
				}
				break;
			case T__18:
			case T__12:
			case T__9:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); eq();
				}
				break;
			case T__13:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); lt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); ne();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(74); contain();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); ncontain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtContext extends ParserRuleContext {
		public GtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitGt(this);
		}
	}

	public final GtContext gt() throws RecognitionException {
		GtContext _localctx = new GtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_gt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitEq(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__12) | (1L << T__9) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LtContext extends ParserRuleContext {
		public LtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitLt(this);
		}
	}

	public final LtContext lt() throws RecognitionException {
		LtContext _localctx = new LtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NeContext extends ParserRuleContext {
		public NeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitNe(this);
		}
	}

	public final NeContext ne() throws RecognitionException {
		NeContext _localctx = new NeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainContext extends ParserRuleContext {
		public ContainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterContain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitContain(this);
		}
	}

	public final ContainContext contain() throws RecognitionException {
		ContainContext _localctx = new ContainContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_contain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NcontainContext extends ParserRuleContext {
		public NcontainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ncontain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterNcontain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitNcontain(this);
		}
	}

	public final NcontainContext ncontain() throws RecognitionException {
		NcontainContext _localctx = new NcontainContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ncontain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class 变量Context extends ParserRuleContext {
		public TerminalNode Letter(int i) {
			return getToken(CalcParser.Letter, i);
		}
		public List<TerminalNode> Letter() { return getTokens(CalcParser.Letter); }
		public 变量Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_变量; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enter变量(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exit变量(this);
		}
	}

	public final 变量Context 变量() throws RecognitionException {
		变量Context _localctx = new 变量Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_变量);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90); match(Letter);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Letter );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2"+
		"\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\3\3\3\5\3\62\n\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\5\7=\n\7\3\7\3\7\3\7\3\b\3\b\3\t\6\tE\n\t\r"+
		"\t\16\tF\3\n\3\n\3\n\3\n\3\n\3\n\5\nO\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21^\n\21\r\21\16\21_\3\21\2\2\22\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\5\2\f\f\20\20\23\24\4\2\3\3"+
		"\22\22\4\2\7\7\16\16\6\2\4\4\n\n\r\r\17\17\4\2\t\t\25\25[\2\"\3\2\2\2"+
		"\4\61\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f<\3\2\2\2\16A\3"+
		"\2\2\2\20D\3\2\2\2\22N\3\2\2\2\24P\3\2\2\2\26R\3\2\2\2\30T\3\2\2\2\32"+
		"V\3\2\2\2\34X\3\2\2\2\36Z\3\2\2\2 ]\3\2\2\2\"#\7\b\2\2#)\5\n\6\2$%\5\4"+
		"\3\2%&\5\f\7\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3"+
		"\2\2\2+)\3\2\2\2,-\7\5\2\2-.\7\2\2\3.\3\3\2\2\2/\62\5\6\4\2\60\62\5\b"+
		"\5\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\t\2\2\2\64\7\3\2\2\2"+
		"\65\66\t\3\2\2\66\t\3\2\2\2\678\5\20\t\289\5\22\n\29:\5 \21\2:\13\3\2"+
		"\2\2;=\5\20\t\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\22\n\2?@\5 \21\2@\r"+
		"\3\2\2\2AB\7\26\2\2B\17\3\2\2\2CE\7\27\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2G\21\3\2\2\2HO\5\24\13\2IO\5\26\f\2JO\5\30\r\2KO\5\32\16\2"+
		"LO\5\34\17\2MO\5\36\20\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2"+
		"\2\2NM\3\2\2\2O\23\3\2\2\2PQ\t\4\2\2Q\25\3\2\2\2RS\t\5\2\2S\27\3\2\2\2"+
		"TU\t\6\2\2U\31\3\2\2\2VW\7\6\2\2W\33\3\2\2\2XY\7\13\2\2Y\35\3\2\2\2Z["+
		"\7\21\2\2[\37\3\2\2\2\\^\7\27\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`!\3\2\2\2\b)\61<FN_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}