package com.dianping.tuangou.transfer.rule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author code4crafer@gmail.com
 */
public class ParserTest {

    @org.junit.Test
    public void testParser() throws Exception {
        String s = "当价格>x并且品质等于y并且小于z时";
        System.out.println(s);
        Operator operator = new Parser().parse(s);
        System.out.println(JSON.toJSONString(operator, SerializerFeature.PrettyFormat));
    }
}
