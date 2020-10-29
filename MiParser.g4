parser grammar MiParser;

options {
  tokenVocab = MiScanner;
}

program
        : singleCommand                                             #programAST;
command : singleCommand (PyCOMA singleCommand)*                     #commandAST;
singleCommand
        :
        ident ASIGN expression                                      #assignSingleCommandAST
        | ident PIZQ expression PDER                                #callSingleCommandAST
        | IF expression THEN singleCommand
                        ELSE singleCommand                          #ifSingleCommandAST
        | WHILE expression DO singleCommand                         #whileSingleCommandAST
        | LET declaration IN singleCommand                          #letSingleCommandAST
        | BEGIN command END                                         #blockSingleCommandAST;
declaration  : singleDeclaration (PyCOMA singleDeclaration)*        #declarationAST;

singleDeclaration : CONST IDENT VIR expression                      #constSingleDeclarationAST
    	   | VAR IDENT DOSPUNTOS typeDenoter                        #varSingleDeclarationAST;
typeDenoter : IDENT                                                 #typeDenoterAST;

expression : primaryExpression (operator primaryExpression)*        #expressionAST;
primaryExpression : LITERAL                                         #numPrimaryExpressionAST
        | ident                                                     #idPrimaryExpressionAST
        | PIZQ expression PDER                                      #groupPrimaryExpressionAST;
operator : SUMA | RESTA | MULT | DIV                                #operatorAST;

ident
locals [SingleDeclarationContext decl = null]: IDENT                #identAST;
