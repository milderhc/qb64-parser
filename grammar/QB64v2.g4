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

arg_expression_list     : arg_expression arg_expression_list1 ;
arg_expression_list1    : ',' arg_expression_list
                        |
                        ;

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
                        | arg_expression_list
                        |
                        ;
idblock2                : '(' expression_list ')' '=' expression
                        | '=' expression
                        ;
idblock3                : arg_expression ')' idblock6
                        | expression idblock7
                        ;

idblock6                : ',' arg_expression_list
                        |
                        ;
idblock7                : ')' '=' expression
                        | ',' expression idblock7
                        ;

arg_expression          : value binary_expression
                        | unary_expression
                        | '(' arg_expression ')' binary_expression
                        | ID arg_expression1
                        ;
arg_expression1         : non_empty_suffix '(' arguments_list ')' binary_expression
                        | '(' arg_expression2
                        | binary_expression
                        ;
arg_expression2         : ')'
                        | arguments_list ')' binary_expression
                        ;

expression              : value binary_expression
                        | unary_expression
                        | '(' expression ')' binary_expression
                        | single_id expression1
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

forblock                : 'for' single_numeric_id '=' expression 'to' expression step instruction 'next' ;
step                    : 'step' expression
                        |
                        ;

whileblock              : 'while' expression instruction 'wend' ;
dosomethingblock        : 'do' instruction 'loop' doblocks ;
doblocks                : 'while' expression
                        | 'until' expression
                        ;

selectblock             : 'select' 'case' id case_list 'end' 'select' ;
case_list               : 'case' case_list1
                        |
                        ;
case_list1              : value instruction case_list
                        | 'else' instruction
                        ;

/************************************* Functions and Subs ***********************************************/

function_sub            : 'sub' ID parameters_list instruction 'end' 'sub' function_sub
                        | 'function' single_id parameters_list instruction 'end' 'function' function_sub
                        |
                        ;

parameters_list         : '(' parameters_list1 ')'
                        |
                        ;
parameters_list1        : ID parameters_list2 ;
parameters_list2        : non_empty_suffix parameters_list3
                        | '(' ')' 'as' type parameters_list3
                        | parameters_list3
                        ;
parameters_list3        : ',' parameters_list1
                        |
                        ;

arguments_list          : '(' arg_expression ')' arguments_list1
                        | arg_expression arguments_list1
                        ;

arguments_list1         : ',' arguments_list
                        |
                        ;

/************************************************* I/O *************************************************/
input                   : 'input' id id_list ;

id_list                 : ',' id id_list
                        |
                        ;

print                   : 'print' print1 ;
print1                  : expression print1
                        | ';' print1
                        |
                        ;

/*******************************************************************************************************/

value                   : VALOR_ENTERO
                        | VALOR_SINGLE
                        | VALOR_DOUBLE
                        | VALOR_LONG
                        | VALOR_STRING
                        ;

binary_operator         : 'and' | 'or' | 'xor' | '+' | '-' | '*' | '/' | '=' | '<>' | '<' | '>' | '<=' | '>=' | '^' | 'mod' ;
unary_operator          : 'not' | '-' ;

type                    : 'integer'
                        | 'single'
                        | 'double'
                        | 'long'
                        | 'string'
                        ;

VALOR_ENTERO            : [3][2][7][6][0-7]
                        | [3][2][7][0-5][0-9]
                        | [3][2][0-6][0-9][0-9]
                        | [3][0-1][0-9][0-9][0-9]
                        | [1-2][0-9][0-9][0-9][0-9]
                        | [0]?[0-9]?[0-9]?[0-9]?[0-9]
                        ;
VALOR_LONG              : [0-9]+ ;
VALOR_SINGLE                  : [0-9]+[.][0-9][0-9]?[0-9]?[0-9]?[0-9]?[0-9]? ;
VALOR_DOUBLE                  : [0-9]+[.][0-9][0-9][0-9][0-9][0-9][0-9][0-9]+ ;
VALOR_STRING                  : ('"') ~[\n"]* ('"');

ID                      : [a-zA-Z][a-zA-Z0-9_]* ;
COMMENT                 : '\'' ~[\r\n]* -> skip ;
WS                      : [ \t\r\n]+ -> skip ;

