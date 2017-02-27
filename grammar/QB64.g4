grammar QB64;

qb : main (funproc)* EOF ;

main : commands
     ;

commands : command commands
         |
         ;

command : if_
        | while_
        | do_while
        | do_until
        | for_
        ;

if_ : IF expression THEN commands (ELSE commands)? ENDIF ;
while_ : WHILE expression commands WEND ;
do_while : DO commands LOOP WHILE expression ;
do_until : DO commands LOOP UNTIL expression ;
for_ : FOR numeric_asignment
       TO expression commands
       (STEP expression)*
       NEXT (ID)* ;


numeric_asignment : ID OPEQUAL expression ;


expression : numeric_value ;
numeric_value : INT ;
INT : [0-9]+ ;

//Operators
OPEQUAL : '=' ;

//Keywords
IF : I F ;
THEN : T H E N ;
ELSE : E L S E ;
ENDIF : E N D ~['\'"']+ IF ;

WHILE : W H I L E ;
WEND : W E N D ;
DO : D O ;
LOOP : L O O P ;
UNTIL : U N T I L ;

FOR : F O R ;
TO : T O ;
STEP : S T E P ;
NEXT : N E X T ;


funproc : 'askldfj' ;


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

ID : [a-zA-Z][a-zA-Z0-9_]* ;
WS : [ \t\r\n]+ -> skip ;
