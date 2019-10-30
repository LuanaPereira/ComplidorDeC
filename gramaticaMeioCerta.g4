grammar GramaticaC;
inicio:     (include)?
            |(funcaoExp)?
            |(varGlobal)?
            |funcaomain
            ;
include:    (INCLUDE LS STR GR)+
            ;

funcaoExp:  (tipo STR OEX tipo var (SEP tipo var)+ CEX bloco)+
            ;

varGlobal:  OBL (declarar)+ CBL

funcaomain: INT MAIN OEX CEX OBL programa RETURN '0' EOL CBL
            ;

programa:   (linha EOL)+
            ;

linha:      declarar                
            | escrever         
            | atribuir         
            | ifExpressao       
            | ler
            //| funcaoExp         #linhaFuncaoExpressao
            ;

tipo:       INT
            | DOUBLE 
            | CHAR
            | FLOAT
            ;

declarar:   tipo STR(SEP STR)* EOL
            ;

ler         : LER var() EOL
            ;

escrever:   ESCREVER STR EOL        #escreverStr
            | ESCREVER expr EOL    #escreverExpr
            ;

atribuir:   var ATR expr EOL
            ;

ifExpressao:IF EOX boolExpr CEX bloco 
            | IF OEX boolExpr CEX bloco ELSE bloco
            ;

expr        : term ADD expr 
            | term SUB expr
            ;

term        : fact MUL term 
            | fact DIV term 
            | fact MOD term
            ;

fact        : var 
            | num
            | OBL expr CBL 
            ;

boolExpr:   fact 
            | NOT boolExpr 
            | fact relop fact 
            | TRUE 
            | FALSE
            ;

relop       : GR 
            | LS 
            | EQ 
            | GRT 
            | LST 
            | NEQ
            ;

bloco:      linha  
            | OBL programa RETURN var CBL
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
SEP         : ',';
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
INCLUDE     :'#include';
MAIN        :'main';
RETURN      :'return'
