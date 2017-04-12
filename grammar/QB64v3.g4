grammar QB64v3;
import QB64v3Lex;

qb                      : instruction* funproc* EOF ;

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

expression              : value=(INTEGERV | DOUBLEV | STRINGV)                     # valueExpr
                        | id                                                       # idExpr
                        | '(' expression ')'                                       # parenExpr
                        | op=('-' | NOT) expression                                # unaryExpr
                        | expression '^' expression                                # potExpr
                        | expression op=('/' | '*' | MOD) expression               # mulExpr
                        | expression op=('+' | '-') expression                     # addExpr
                        | expression op=('<' | '<=' | '>' | '>=') expression       # cmpExpr
                        | expression op=('=' | '<>') expression                    # eqExpr
                        | expression AND expression                                # andExpr
                        | expression op=(OR | XOR) expression                      # orExpr
                        ;

callSub                 : ID parametersList? ;

parametersList          : '(' funprocArg ')' (',' parametersList)*                 # valuePar
                        | funprocArg (',' parametersList)*                         # referencePar
                        ;
funprocArg              : expression
                        | ID '(' ')'
                        ;
                        
input                   : INPUT id (',' id)* ;
print                   : PRINT expression (';' expression)* ;

ifBlock                 : IF expression THEN instruction*
                          (ELSEIF expression THEN instruction*)*
                          (ELSE instruction*)? END IF ;
whileBlock              : WHILE expression instruction* WEND ;
doWhileBlock            : DO instruction* LOOP WHILE expression ;
doUntilBlock            : DO instruction* LOOP UNTIL expression ;
forBlock                : FOR singleId '=' expression TO expression
                          (STEP expression)?
                          instruction* NEXT ;

selectBlock             : SELECT CASE id casesList?
                          (CASE ELSE instruction*)? END SELECT ;
casesList               : CASE expression instruction* casesList? ;

funproc                 : FUNCTION singleId ('(' funprocPar (',' funprocPar)* ')')?
                          instruction* END FUNCTION                                     # function
                        | SUB ID ('(' funprocPar (',' funprocPar)* ')')?
                          instruction* END SUB                                          # sub
                        ;

funprocPar              : singleId
                        | ID '(' ')' AS
                          type=(INTEGER | LONG | SINGLE | DOUBLE | STRING)
                        ;

suffix                  : suffixType=('%' | '&' | '!' | '#' | '$');
