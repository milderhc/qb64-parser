grammar QB64;

qb                  : main (funproc)* EOF ;

main                : commands
                    ;

commands            : command commands
                    |
                    ;

command             : if_
                    | while_
                    | do_while
                    | do_until
                    | for_
                    | select_
                    | call_sub
                    | declaration
                    | const_declaration
                    | assignment
                    | print
                    | input
                    ;

input               : INPUT (STRINGVALUE COMMA)? id_list ;
print               : PRINT print_list ;
print_list          : (expression | id) (SEMICOLON print_list)* SEMICOLON? ;

if_                 : IF expression THEN commands (ELSEIF commands)* (ELSE commands)? END IF ;
while_              : WHILE expression commands WEND ;
do_while            : DO commands LOOP WHILE expression ;
do_until            : DO commands LOOP UNTIL expression ;
for_                : FOR single_numeric_assignment
                        TO expression (STEP expression)?
                        commands
                        NEXT (IDPREFIX)? ;

select_             : SELECT CASE id (cases_list)* (CASE ELSE commands)? END SELECT ;
cases_list          : CASE expression commands (cases_list)* ;

declaration         : DIM SHARED? id_list AS type ;
id_list             : id (COMMA id_list)* ;

const_declaration   : CONST const_declaration_list ;
const_declaration_list : single_id EQUALOP expression (COMMA const_declaration_list)* ;

assignment          : id EQUALOP expression
                    ;

single_numeric_assignment : single_numeric_id EQUALOP expression ;
array_numeric_assignment  : array_numeric_id EQUALOP expression ;

id                  : single_id
                    | array_id
                    ;

single_id           : single_numeric_id
                    | single_id_string
                    ;

single_numeric_id   : single_id_int
                    | single_id_long
                    | single_id_single
                    | single_id_double
                    ;

array_id            : array_numeric_id
                    | array_id_string
                    ;

array_numeric_id    : array_id_int
                    | array_id_long
                    | array_id_single
                    | array_id_double
                    ;

array_id_int        : single_id_int array*;
array_id_long       : single_id_long array*;
array_id_single     : single_id_single array*;
array_id_double     : single_id_double array*;
array_id_string     : single_id_string array*;

single_id_int       : IDPREFIX INTEGERSUFFIX;
single_id_long      : IDPREFIX LONGSUFFIX;
single_id_single    : IDPREFIX (SINGLESUFFIX)?;
single_id_double    : IDPREFIX DOUBLESUFFIX;
single_id_string    : IDPREFIX STRINGSUFFIX;

INTEGERSUFFIX       : '%' ;
LONGSUFFIX          : '&' ;
SINGLESUFFIX        : '!' ;
DOUBLESUFFIX        : '#' ;
STRINGSUFFIX        : '$' ;

array               : LEFTPAR expression_list RIGHTPAR ;
expression_list     : expression (COMMA expression_list)* ;

expression          : value
                    | expression POTOP expression
                    | expression proop expression
                    | expression SUBOP expression
                    | expression ADDOP expression
                    | SUBOP expression
                    | negop expression
                    | expression compop expression
                    | expression binop expression
                    | call_function
                    | LEFTPAR expression RIGHTPAR
                    | id
                    ;

value               : numeric_value
                    | string_value
                    ;

numeric_value       : INTEGERVALUE
                    | LONGVALUE
                    | SINGLEVALUE
                    | DOUBLEVALUE
                    ;

string_value        : STRINGVALUE ;

type                : INTEGER
                    | LONG
                    | SINGLE
                    | DOUBLE
                    | STRING
                    ;

INTEGERVALUE        : [3][2][7][6][0-7]
                    | [3][2][7][0-5][0-9]
                    | [3][2][0-6][0-9][0-9]
                    | [3][0-1][0-9][0-9][0-9]
                    | [1-2][0-9][0-9][0-9][0-9]
                    | [0]?[0-9]?[0-9]?[0-9]?[0-9]
                    ;

LONGVALUE           : [0-9]+ ;
SINGLEVALUE         : [0-9]+[.][0-9][0-9]?[0-9]?[0-9]?[0-9]?[0-9]? ;
DOUBLEVALUE         : [0-9]+[.][0-9][0-9][0-9][0-9][0-9][0-9][0-9]+ ;
STRINGVALUE         : ('"') ~[\n"]* ('"');

funproc             : FUNCTION single_id (LEFTPAR id_list RIGHTPAR)? commands END FUNCTION
                    | SUB single_id (LEFTPAR id_list RIGHTPAR)? commands END SUB
                    ;


call_sub            : IDPREFIX parameters_list? ;
call_function       : single_id (LEFTPAR parameters_list RIGHTPAR)? ;

parameters_list     : (LEFTPAR expression RIGHTPAR) (COMMA parameters_list)*
                    | expression (COMMA parameters_list)*
                    ;


//Operators
negop               : NOT ;
compop              : (DIFFOP | LESSOP | LESSOREQUALOP | GREATER | GREATEROREQUAL);
binop               : (OR | AND | XOR | EQUALOP);
proop               : (DIVOP | PRODUCTOP | MOD);

EQUALOP             : '=' ;

POTOP               : ('^');

DIVOP               : '/' ;
PRODUCTOP           : '*' ;
ADDOP               : ('+');
SUBOP               : ('-');

DIFFOP              : '<>' ;
LESSOP              : '<' ;
LESSOREQUALOP       : '<=' ;
GREATER             : '>' ;
GREATEROREQUAL      : '>=' ;

SEMICOLON           : ';';
COLON               : ':';
COMMA               : ',' ;
LEFTPAR             : '(';
RIGHTPAR            : ')';


//Keywords
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

IDPREFIX : [a-zA-Z][a-zA-Z0-9_]* ;
COMMENT  : '\'' ~[\r\n]* -> skip ;
WS : [ \t\r\n]+ -> skip ;
ErrorCharacter : . ;