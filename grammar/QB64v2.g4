grammar QB64v2;

qb                      : instruction function_sub EOF ;

instruction             : declaration instruction
                        | constdeclaration instruction
                        | ifblock instruction
                        | forblock instruction
                        | whileblock instruction
                        | dosomethingblock instruction
                        | selectblock instruction
                        | idblock instruction
                        | input instruction
                        | print instruction
                        |
                        ;

/****************************** Declaration and assignment *********************************************/

declaration             : 'dim' declaration1 ;
declaration1            :  dim_id_list 'as' type
                        |  'shared' dim_id_list 'as' type
                        ;

dim_id                  : ID array ;
array                   : '(' expression_list ')'
                        |
                        ;
dim_id_list             : dim_id dim_id_list1 ;
dim_id_list1            : ',' dim_id_list
                        |
                        ;

single_id               : ID suffix ;
single_numeric_id       : ID numeric_suffix ;
id                      : ID suffix array ;
suffix                  : '$' | '!' | '%' | '&' | '#' | ;
non_empty_suffix        : '$' | '!' | '%' | '&' | '#' ;
numeric_suffix          : '!' | '%' | '&' | '#' | ;

expression_list         : expression expression_list1 ;
expression_list1        : ',' expression_list
                        |
                        ;

constdeclaration        : 'const' single_id '=' expression constdeclaration1 ;
constdeclaration1       : ',' single_id '=' expression constdeclaration1
                        |
                        ;

idblock                 : ID idblock1 ;
idblock1                : non_empty_suffix idblock2
                        | '(' idblock3
                        | '=' expression
                        | expression_list
                        |
                        ;
idblock2                : '(' expression_list ')' '=' expression
                        | '=' expression
                        ;
idblock3                : expression idblock4 ;
idblock4                : ')' idblock5
                        | ',' idblock6
                        ;
idblock5                : '=' expression
                        | expression_list
                        |
                        ;
idblock6                : expression idblock7 ;
idblock7                : ')' '=' expression
                        | ',' idblock6
                        ;

expression              : value binary_expression
                        | unary_expression
                        | '(' expression ')' binary_expression
                        | id expression1
                        ;
unary_expression        : unary_operator expression ;
binary_expression       : binary_operator expression
                        |
                        ;
expression1             : '(' arguments_list ')' binary_expression
                        | binary_expression
                        ;


/************************************** Control Structures **********************************************/

ifblock                 : 'if' expression 'then' instruction elseif elseblock 'end' 'if' ;
elseif                  : 'elseif' expression 'then' instruction elseif
                        |
                        ;
elseblock               : 'else' instruction
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
dosomethingblock        : 'do' instruction 'loop' doblocks ;
doblocks                : 'while' expression
                        | 'until' expression
                        ;

selectblock             : 'select' 'case' id case_list case_else 'end' 'select' ;
case_list               : 'case' expression instruction case_list
                        |
                        ;
case_else               : 'case' 'else' instruction
                        |
                        ;

/************************************* Functions and Subs ***********************************************/

function_sub            : 'sub' ID parameters_list instruction 'end' 'sub' function_sub
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

arguments_list          : '(' expression ')' arguments_list1
                        | expression arguments_list1
                        |
                        ;
arguments_list1         : ',' arguments_list
                        |
                        ;

/************************************************* I/O *************************************************/
input                   : 'input' input1 ;
input1                  : STRING parameters_list2
                        | parameters_list1
                        ;

print                   : 'print' print1 ;
print1                  : expression print1
                        | ';' print1
                        |
                        ;

/*******************************************************************************************************/

value                   : INTEGER
                        | SINGLE
                        | DOUBLE
                        | LONG
                        | STRING
                        ;

binary_operator         : 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '=' | '<>' | '<' | '>' | '<=' | '>=' | '^' ;
unary_operator          : 'not' | '-' ;

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
COMMENT                 : '\'' ~[\r\n]* -> skip ;
WS                      : [ \t\r\n]+ -> skip ;

