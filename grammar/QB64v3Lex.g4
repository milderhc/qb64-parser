lexer grammar QB64v3Lex;

INTEGERV                : [0-9]+ ;
DOUBLEV                 : [0-9]+[.][0-9]+ ;
STRINGV                 : ('"') ~[\n"]* ('"');

EQUAL                   : '=' ;
POT                     : '^';

DIV                     : '/' ;
PRODUCT                 : '*' ;
ADD                     : '+';
SUBT                    : '-';

DIFF                    : '<>' ;
LESS                    : '<' ;
LESSOREQUAL             : '<=' ;
GREATER                 : '>' ;
GREATEROREQUAL          : '>=' ;

SEMICOLON               : ';';
COLON                   : ':';
COMMA                   : ',' ;
LEFTPAR                 : '(';
RIGHTPAR                : ')';

SINGLESUFFIX            : '!' ;
DOUBLESUFFIX            : '#' ;
INTEGERSUFFIX           : '%' ;
LONGSUFFIX              : '&' ;
STRINGSUFFIX            : '$' ;


INPUT           : I N P U T ;
PRINT           : P R I N T ;
IF              : I F ;
THEN            : T H E N ;
ELSE            : E L S E ;
ELSEIF          : E L S E I F ;
END             : E N D ;
WHILE           : W H I L E ;
WEND            : W E N D ;
DO              : D O ;
LOOP            : L O O P ;
UNTIL           : U N T I L ;
FOR             : F O R ;
TO              : T O ;
STEP            : S T E P ;
NEXT            : N E X T ;
INTEGER         : I N T E G E R ;
SINGLE          : S I N G L E ;
DOUBLE          : D O U B L E ;
LONG            : L O N G ;
STRING          : S T R I N G ;
DIM             : D I M ;
AS              : A S ;
NOT             : N O T ;
OR              : O R ;
AND             : A N D ;
XOR             : X O R ;
MOD             : M O D ;
SUB             : S U B ;
FUNCTION        : F U N C T I O N ;
SELECT          : S E L E C T ;
CASE            : C A S E ;
SHARED          : S H A R E D ;
CONST           : C O N S T ;

fragment A: 'a' | 'A' ;
fragment B: 'b' | 'B' ;
fragment C: 'c' | 'C' ;
fragment D: 'd' | 'D' ;
fragment E: 'e' | 'E' ;
fragment F: 'f' | 'F' ;
fragment G: 'g' | 'G' ;
fragment H: 'h' | 'H' ;
fragment I: 'i' | 'I' ;
fragment J: 'j' | 'J' ;
fragment K: 'k' | 'K' ;
fragment L: 'l' | 'L' ;
fragment M: 'm' | 'M' ;
fragment N: 'n' | 'N' ;
fragment O: 'o' | 'O' ;
fragment P: 'p' | 'P' ;
fragment Q: 'q' | 'Q' ;
fragment R: 'r' | 'R' ;
fragment S: 's' | 'S' ;
fragment T: 't' | 'T' ;
fragment U: 'u' | 'U' ;
fragment V: 'v' | 'V' ;
fragment W: 'w' | 'W' ;
fragment X: 'x' | 'X' ;
fragment Y: 'y' | 'Y' ;
fragment Z: 'z' | 'Z' ;

ID       : [a-zA-Z][a-zA-Z0-9_]* ;
COMMENT  : '\'' ~[\r\n]* -> skip ;
WS       : [ \t\r\n]+ -> skip ;