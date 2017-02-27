grammar QB64;

qb                  : main (funproc)* EOF ;

main                : commands
                    ;

commands            : command commands
                    |
                    ;

command             :    if_
                    | while_
                    | do_while
                    | do_until
                    | for_
                    | declaration
                    ;

if_                 : IF expression THEN commands (ELSE commands)? ENDIF ;
while_              : WHILE expression commands WEND ;
do_while            : DO commands LOOP WHILE expression ;
do_until            : DO commands LOOP UNTIL expression ;
for_                : FOR single_numeric_assignment
                        TO expression commands
                        (STEP expression)?
                        NEXT (IDPREFIX)? ;


declaration         : DIM id_list AS type ;
id_list             : id (COMMA id_list)* ;

type                : INTEGER
                    | LONG
                    | SINGLE
                    | DOUBLE
                    | STRING
                    ;

single_numeric_assignment : single_numeric_id OPEQUAL expression ;

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
                    
array_id            : array_id_int
                    | array_id_long
                    | array_id_single
                    | array_id_double
                    | array_id_string
                    ;
                    
array_id_int        : single_id_int array*;
array_id_long       : single_id_long array*;
array_id_single     : single_id_single array*;
array_id_double     : single_id_double array*;
array_id_string     : single_id_string array*;

single_id_int       : IDPREFIX '%';
single_id_long      : IDPREFIX '&';
single_id_single    : IDPREFIX ('!')?;
single_id_double    : IDPREFIX '#';
single_id_string    : IDPREFIX '$';

array               : LEFTPAR expression_list RIGHTPAR ;
expression_list     : expression (COMMA expression_list)* ;

expression          : numeric_value ;
numeric_value       : INTVALUE ;
INTVALUE            : [0-9]+ ;


//Operators
OPEQUAL         : '=' ;

OPADD           : ('+');
OPSUB           : ('-');

PYC             : ';';
DOSP            : ':';
LEFTPAR         : '(';
RIGHTPAR        : ')';
COMMA           : ',' ;


//Keywords
IF              : I F ;
THEN            : T H E N ;
ELSE            : E L S E ;
ENDIF           : E N D ~['\'"']+ IF ;

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

funproc         : 'askldfj' ;


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
WS : [ \t\r\n]+ -> skip ;
