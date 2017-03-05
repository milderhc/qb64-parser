grammar QB64_;

qb                      : instruction function_sub EOF ;

instruction             : declaration instruction
                        | constdeclaration instruction
                        | idinstruction instruction
                        | ifblock instruction
                        | forblock instruction
                        | whileblock instruction
                        | dowhileblock instruction
                        | dountilblock instruction
                        | selectblock instruction
                        |
                        ;

/****************************** Declaration and assignment *********************************************/

declaration             : 'dim' declaration1 ;
declaration1            :  dim_id 'as' type
                        |  'shared' dim_id 'as' type
                        ;

dim_id                  : ID array ;
array                   : '(' expression_list ')'
                        |
                        ;

single_id               : ID suffix ;
single_numeric_id       : ID numeric_suffix ;
id                      : ID suffix array ;
suffix                  : '$' | '!' | '%' | '&' | '#' | ;
numeric_suffix          : '!' | '%' | '&' | '#' | ;

expression_list         : expression expression_list1 ;
expression_list1        : ',' expression_list
                        |
                        ;

idinstruction           : id idinstruction1 ;
idinstruction1          : assignment
                        | callsub
                        ;

assignment              : '=' expression ;
constdeclaration        : 'const' single_id '=' expression ;

expression              : value expression1
                        | '(' expression ')' expression1
                        | id expression2
                        ;
expression1             : operator expression
                        |
                        ;
expression2             : expression1
                        | '(' arguments_list ')' expression1
                        ;


/************************************** Control Structures **********************************************/

ifblock                 : 'if' expression 'then' instruction elseif else 'end' 'if' ;
elseif                  : 'elseif' expression 'then' instruction elseif
                        |
                        ;
else                    : 'else' instruction
                        |
                        ;

forblock                : 'for' single_numeric_id '=' expression 'to' expression step instruction next ;
step                    : 'step' expression
                        |
                        ;
next                    : 'next' nextid ;
nextid                  : id
                        |
                        ;

whileblock              : 'while' expression instruction 'wend' ;
dowhileblock            : 'do' instruction 'loop' 'while' expression ;
dountilblock            : 'do' instruction 'loop' 'until' expression ;

selectblock             : 'select' 'case' id case_list case_else 'end' 'select' ;
case_list               : 'case' expression instruction case_list
                        |
                        ;
case_else               : 'case' 'else' instruction
                        |
                        ;

/************************************* Functions and Subs ***********************************************/

function_sub            : 'sub' single_id parameters_list instruction 'end' 'sub' function_sub
                        | 'function' single_id parameters_list instruction 'end' 'function' function_sub
                        |
                        ;

parameters_list         : '(' parameters_list1 ')'
                        |
                        ;
parameters_list1        : id parameters_list2 ;
parameters_list2        : ',' parameters_list1
                        |
                        ;

callsub                 : 'fixthis'
                        ;

arguments_list          : '(' expression ')' arguments_list1
                        | expression arguments_list1
                        ;
arguments_list1         : ',' arguments_list
                        |
                        ;

/*******************************************************************************************************/

value                   : INTEGER
                        | SINGLE
                        | DOUBLE
                        | LONG
                        | STRING
                        ;

operator                : 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '=' | '<>' | '<' | '>' | '<=' | '>=' ;

type                    : 'integer'
                        | 'single'
                        | 'double'
                        | 'long'
                        | 'string'
                        ;

INTEGER                 : [3][2][7][6][0-7]
                        | [3][2][7][0-5][0-9]
                        | [3][2][0-6][0-9][0-9]
                        | [3][0-1][0-9][0-9][0-9]
                        | [1-2][0-9][0-9][0-9][0-9]
                        | [0]?[0-9]?[0-9]?[0-9]?[0-9]
                        ;
LONG                    : [0-9]+ ;
SINGLE                  : [0-9]+[.][0-9][0-9]?[0-9]?[0-9]?[0-9]?[0-9]? ;
DOUBLE                  : [0-9]+[.][0-9][0-9][0-9][0-9][0-9][0-9][0-9]+ ;
STRING                  : ('"') ~[\n"]* ('"');

ID                      : [a-zA-Z][a-zA-Z0-9_]* ;
WS                      : [ \t\r\n]+ -> skip ;

