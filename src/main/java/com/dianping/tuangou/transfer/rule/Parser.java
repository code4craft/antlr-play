package com.dianping.tuangou.transfer.rule;

import com.dianping.tuangou.transfer.parser.CalcLexer;
import com.dianping.tuangou.transfer.parser.CalcParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author code4crafer@gmail.com
 */
public class Parser {

    public Operator parse(String str) throws IOException {
        CalcLexer lexer = new CalcLexer(new ANTLRInputStream(new ByteArrayInputStream(str.getBytes())));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        CalcParser.ExpContext tree = parser.exp();
        CalcParser.比较块Context 比较块 = (CalcParser.比较块Context) tree.比较块();
        String operatorType = detectOperatorType(比较块.比较());
        Operator operator = new Operator();
        operator.setOperator(operatorType);
        operator.setKey(比较块.属性().getText());
        operator.setVal(比较块.变量().getText());
        String attribute = 比较块.属性().getText();
        List<CalcParser.比较块可以无属性的比较块Context> 比较块可以无属性的比较块 = tree.比较块可以无属性的比较块();
        if (比较块可以无属性的比较块 == null || 比较块可以无属性的比较块.isEmpty()) {
            return operator;
        }
        Operator rootOperator = new Operator();
        rootOperator.setOperator(detectLogic(tree.逻辑(0)));
        rootOperator.setParams(new ArrayList<Operator>());
        rootOperator.getParams().add(operator);
        for (CalcParser.比较块可以无属性的比较块Context context : 比较块可以无属性的比较块) {
            operatorType = detectOperatorType(context.比较());
            if (context.属性() != null) {
                attribute = context.属性().getText();
            }
            Operator operatorTmp = new Operator();
            operatorTmp.setOperator(operatorType);
            operatorTmp.setKey(attribute);
            operatorTmp.setVal(context.变量().getText());
            rootOperator.getParams().add(operatorTmp);
        }
        return rootOperator;
    }

    private String detectLogic(CalcParser.逻辑Context 逻辑) {
        if (逻辑.and() != null) {
            return "and";
        }
        if (逻辑.or() != null) {
            return "or";
        }
        return null;
    }

    private String detectOperatorType(CalcParser.比较Context 比较Context) {
        if (比较Context.contain() != null) {
            return "contain";
        }
        if (比较Context.ncontain() != null) {
            return "not_contain";
        }
        if (比较Context.eq() != null) {
            return "equal";
        }
        if (比较Context.ne() != null) {
            return "not_equal";
        }
        if (比较Context.gt() != null) {
            return "greater";
        }
        if (比较Context.lt() != null) {
            return "less";
        }
        return 比较Context.getText();
    }
}
