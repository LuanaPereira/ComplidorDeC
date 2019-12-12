grammar GramaticaC;

@header { package compiladorc.parser;}

programa:   includes?
            globais?
            functions?
            main
            ;
includes:   (INCLUDE STR)+
            ;
globais:    GLOBAIS OPC vars+ CLC
            ;
functions:  function+
            ;
function:   FUNCTION type ID OPP ((type ID SEP)* type ID)? CLP block
            ;
main:       INT MAIN OPP CLP block
            ;
block:      OPC line+ CLC
            ;
line:         read          #lineRead
            | write         #lineWrite
            | atr           #lineAtr
            | ifstm         #lineIfStm
            | func          #linefunc
            | vars          #linevars
            | whileLoop     #lineWhileLoop
            | forLoop       #lineForLoop
            ;
vars:       type ids EOL                 #var
            ;
func:       ID OPP ((ID SEP)* ID)? CLP EOL
            ;
whileLoop:  WHILE OPP boolExpr CLP block            #while
            ;
forLoop:    FOR OPP atr boolExpr EOL atr CLP block
            ;
read:       READ OPP ID CLP EOL
            ;
write:        WRITE OPP STR CLP EOL    #writeStr
            | WRITE OPP ID CLP EOL     #writeID
            | WRITE OPP expr CLP EOL   #writeExpr  
            ;

ifstm:        IF OPP boolExpr CLP block                 #ifSemElse
            | IF OPP boolExpr CLP block ELSE block      #ifComElse
            ;
atr:        ID ATR expr EOL
            ;
expr:         term ADD expr         #exprAdd
            | term SUB expr         #exprSub
            | term                  #exprTerm
            ;
term:         fact MUL term         #termMul
            | fact DIV term         #termDiv
            | fact MOD term         #termMod
            | fact                  #termFact
            ;
fact:         ID                    #factId
            | NUM                   #factNum
            | OPP expr CLP          #factExpr
            ;
boolExpr:     fact
            | NOT boolExpr
            | fact relop fact
            | TRUE
            | FALSE
            ;
relop:        GR
            | LS
            | EQ
            | GRT
            | LST
            | NEQ
            ;
type:       INT                 #typeInt
            | FLOAT             #typeFloat
            | DOUBLE            #typeDouble
            | CHAR              #typeChar
            | BOOL              #typeBool
            ;
ids:        ID
            ;

//tokens

INT         :'int';
FLOAT       :'float';
DOUBLE      :'double';
CHAR        :'char';
BOOL        :'bool';
INCLUDE     :'#include';
TRUE        :'true';
FALSE       :'false';
READ        :'read';
WRITE       :'print';
IF          :'if';
ELSE        :'else';
GLOBAIS     :'global';
OPC         :'{';
CLC         :'}';
OPP         :'(';
CLP         :')';
//Tirei var e colocar ID          :[a-zA-Z]\w*;//-->ver
SEP         :',';
FUNCTION    :'function';
MAIN        :'main';
WHILE       :'while';
FOR         :'for';
ATR         :'=';
NOT         :'!'|'NOT';
ADD         :'+';
SUB         :'-';
MUL         :'*';
DIV         :'/';
MOD         :'%';
EOL         :';';
GR          :'>';
LS          :'<';
EQ          :'==';
GRT         :'>=';
LST         :'<=';
NEQ         :'!=';
STR         :'"'(~["\\\r\n])*'"';
NUM         :[+-]?[0-9]+('.'[0-9]+)?;
ID          :[a-zA-Z][a-zA-Z0-9_]*;
COMMENT     :'/*' .*? '*/' -> skip;
LINE_COMMENT:'//' ~[\r\n]* -> skip;
WS          :[ \t\r\n]+ -> skip;