grammar GramaticaC;
inicio:     include
            |funcaoExp
            |varGlobal
            |funcaomain
            |programa
            ;
include:    ('#include' '<' STR '>')+
            ;

funcaoExp:  tipo STR '(' tipo var ')' bloco
            ;

funcaomain: 'int' 'main' '(' ')' '{'programa 'return 0' '}'
            ;

programa:   (linha EOL)+
            ;

linha:      ler                 #linhaLer
            | escrever          #linhaEscrever
            | atribuir          #linhaAtribuir
            | ifExpressao       #linhaIfExpressao
            | funcaoExp         #linhaFuncaoExpressao
            ;

tipo:       INT
            | DOUBLE 
            | CHAR
            | FLOAT
            ;
ler         : LER var
            ;
escrever:   ESCREVER STR        #escreverStr
            | ESCREVER expr     #escreverExpr
            ;
atribuir:   var '=' expr
            ;
ifExpressao:IF '('boolExpr')' bloco 
            | IF '('boolExpr')' bloco ELSE bloco
            ;
expr        : term '+' expr 
            | term '-' expr
            ;
term        : fact '*' term 
            | fact '/' term 
            | fact '%' term
            ;
fact        : var 
            | num
            | '('expr')' 
            ;
boolExpr:   fact 
            | '!'boolExpr 
            | fact relop fact 
            | TRUE 
            | FALSE
            ;

relop       : '>' 
            | '<' 
            | '==' 
            | '>=' 
            | '<=' 
            | '!='
            ;

bloco:      linha  
            | '{' programa 'return' var '}'
            ;
var:        VARCHAR
            |VARINT
            |VARFLOAT
            |VARDOUBLE
            ;

num:        VARINT
            |VARDOUBLE
            |VARFLOAT
            ;

TRUE        : 'true';
FALSE       : 'false';
LER         : 'ler';
ESCREVER    : 'escrever';
IF          : 'if';
ELSE        : 'else';
STR         : '"'(~["\\\r\n])*'"';
//VAR         : [a-zA-Z][a-zA-Z0-9_]*;
GR          : '>'; 
LS          : '<'; 
EQ          : '=='; 
GRT         : '>=';
LST         : '<='; 
NEQ         : '!=';
ATR         : '=';
OEX         : '(';
CEX         : ')';
OBL         : '{';
CBL         : '}';
NOT         : '!'|'NOT';
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
MOD         : '%';
EOL         : ';';
COMMENT     : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS          : [ \t\r\n]+ -> skip;
VARINT      : ([+-]?[0-9])?;
VARFLOAT    : [+-]?[0-9]+('.'[0-9]+)?;
VARDOUBLE   : ^(-)?(([1-9][0-9]*))(\\.[0-9]+)?;
VARCHAR     : [a-zA-Z]{1,1} ;
INT         :'int';
FLOAT       :'float';
DOUBLE      :'double';
CHAR        :'char';