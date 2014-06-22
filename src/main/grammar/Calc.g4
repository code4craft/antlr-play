grammar Calc;

exp
   : '当' 属性 比较* 变量* '时' EOF
   ;

条件1
    : '靠近'
    ;

属性
    : '价格'
    ;

比较
    : gt|eq|lt
    ;

gt
    : '大于' | '>'
    ;

eq
    : '等于' | '为' | '是' | '='
    ;

lt
    : '小于' | '<'
    ;

变量
    : 'x'|'x1'|'x2'
    ;

fragment
Letter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
    ;
