grammar QB64v3;

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

input               : 'input' (STRINGVALUE ',')? id_list ;
print               : 'print' print_list ;
print_list          : (expression | id) (';' print_list)* ';'? ;

if_                 : 'if' expression 'then' commands ('elseif' commands)* ('else' commands)? 'end' 'if' ;
while_              : 'while' expression commands 'wend' ;
do_while            : 'do' commands 'loop' 'while' expression ;
do_until            : 'do' commands 'loop' 'until' expression ;
for_                : 'for' single_numeric_assignment
                        'to' expression ('step' expression)?
                        commands
                        'next' (IDPREFIX)? ;

select_             : 'select' 'case' id (cases_list)* ('case' 'else' commands)? 'end' 'select' ;
cases_list          : 'case' expression commands (cases_list)* ;

declaration         : 'dim' 'shared'? id_list 'as' type ;
id_list             : id (',' id_list)* ;

const_declaration   : 'const' const_declaration_list ;
const_declaration_list : single_id '=' expression (',' const_declaration_list)* ;

assignment          : id '=' expression
                    ;

single_numeric_assignment : single_numeric_id '=' expression ;
array_numeric_assignment  : array_numeric_id '=' expression ;

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

single_id_int       : IDPREFIX '%';
single_id_long      : IDPREFIX '&';
single_id_single    : IDPREFIX ('!')?;
single_id_double    : IDPREFIX '&';
single_id_string    : IDPREFIX '$';

array               : '(' expression_list ')' ;
expression_list     : expression (',' expression_list)* ;

expression          : value
                    | expression '^' expression
                    | expression proop expression
                    | expression '-' expression
                    | expression '+' expression
                    | '-' expression
                    | negop expression
                    | expression compop expression
                    | expression binop expression
                    | call_function
                    | '(' expression ')'
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

type                : 'integer'
                    | 'long'
                    | 'single'
                    | 'double'
                    | 'string'
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

funproc             : 'function' single_id ('(' id_list ')')? commands 'end' 'function'
                    | 'sub' single_id ('(' id_list ')')? commands 'end' 'sub'
                    ;


call_sub            : IDPREFIX parameters_list? ;
call_function       : single_id ('(' parameters_list ')')? ;

parameters_list     : ('(' expression ')') (',' parameters_list)*
                    | expression (',' parameters_list)*
                    ;


//Operators
negop               : 'not' ;
compop              : ('<>' | '<' | '<=' | '>' | '>=' );
binop               : ('or' | 'and' | 'xor' | '=' );
proop               : ('/' | '*' | 'mod');


IDPREFIX : [a-zA-Z][a-zA-Z0-9_]* ;
COMMENT  : '\'' ~[\r\n]* -> skip ;
WS : [ \t\r\n]+ -> skip ;
ErrorCharacter : . ;