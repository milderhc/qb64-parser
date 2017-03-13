grammar QB64v3;
import QB64v3Lex;

qb                      : instruction* (funproc)* EOF ;

instruction             : declaration
                        | constDeclaration
                        | assignment
                        | ifBlock
                        | whileBlock
                        | doWhileBlock
                        | doUntilBlock
                        | forBlock
                        | selectBlock
                        | callSub
                        | print
                        | input
                        ;

declaration             : DIM SHARED? dimId (',' dimId)* AS
                          type=(INTEGER | LONG | SINGLE | DOUBLE | STRING) ;

dimId                   : ID array? ;
id                      : singleId array? ;
singleId                : ID suffix? ;
array                   : '(' expression (',' expression)* ')' ;

constDeclaration        : CONST singleId '=' expression
                          (',' singleId '=' expression)* ;
assignment              : id '=' expression ;

expression              : expression op=('/' | '*' | MOD | '^') expression         # mulExpr
                        | expression op=('+' | '-') expression                     # addExpr
                        | op=('-' | NOT) expression                                # unaryExpr
                        | expression
                          op=(AND | OR | XOR | '=' | '<>' | '<' | '>' | '<=' | '>=')
                          expression                                               # binExpr
                        | '(' expression ')'                                       # parenExpr
                        | callFunction                                             # callFunctionExpr
                        | id                                                       # callId
                        | value=(INTEGERV | DOUBLEV | STRINGV)                     # putValue
                        ;

callSub                 : ID parametersList? ;
callFunction            : singleId ('(' parametersList ')')? ;

parametersList          : '(' funprocArg ')' (',' parametersList)*               # valuePar
                        | funprocArg (',' parametersList)*                       # referencePar
                        ;
funprocArg              : expression
                        | ID '(' ')'
                        ;
                        
input                   : INPUT (STRINGV ',')? id (',' id)* ;
print                   : PRINT expression? printList* ;
printList               : ';' expression? ;

ifBlock                 : IF expression THEN instruction*
                          (ELSEIF expression THEN instruction*)*
                          (ELSE instruction*)? END IF ;
whileBlock              : WHILE expression instruction* WEND ;
doWhileBlock            : DO instruction* LOOP WHILE expression ;
doUntilBlock            : DO instruction* LOOP UNTIL expression ;
forBlock                : FOR singleId '=' expression TO expression
                          (STEP expression)?
                          instruction* NEXT singleId? ;

selectBlock             : SELECT CASE id (casesList)*
                          (CASE ELSE instruction*)? END SELECT ;
casesList               : CASE expression instruction* (casesList)* ;

funprocPar              : id
                        | ID '(' ')' AS
                          type=(INTEGER | LONG | SINGLE | DOUBLE | STRING)
                        ;
funproc                 : FUNCTION singleId ('(' funprocPar (',' funprocPar)* ')')?
                          instruction* END FUNCTION                                     # function
                        | SUB ID ('(' funprocPar (',' funprocPar)* ')')?
                          instruction* END SUB                                          # sub
                        ;

suffix                  : suffixType=('%' | '&' | '!' | '#' | '$');
