package com.dianping.tuangou.transfer.rule;

import lombok.Data;

import java.util.List;

/**
 * @author code4crafer@gmail.com
 */
@Data
public class Operator {

    private String operator;

    private String key;

    private String val;

    private List<Operator> params;
}
