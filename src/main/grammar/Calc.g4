grammar Calc;

exp
   : '当' 比较块 (逻辑 比较块可以无属性的比较块)* '时' EOF
   ;

逻辑
   : and | or
   ;

and
    : '并且' | '且' | '同时' | '而且'
    ;

or
    : '或者' | '或'
    ;

比较块
    : 属性 比较 变量
    ;

比较块可以无属性的比较块
    : 属性? 比较 变量
    ;

条件1
    : '靠近'
    ;

属性
    : Letter+
    ;

比较
    : gt|eq|lt|ne|contain|ncontain
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

ne
    : '不等于'
    ;

contain
    : '包含'
    ;

ncontain
    : '不包含'
    ;

变量
    : Letter+
    ;

Letter
    :   [a-zA-Z0-1$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
    ;

LetterE
    :   [a-zA-Z0-1$_] // these are the "java letters" below 0xFF
    ;
