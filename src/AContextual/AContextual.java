package AContextual;

import generated.MiParser;
import generated.MiParserBaseVisitor;

public class AContextual extends MiParserBaseVisitor<Object> {

    private TablaSimbolos tabla;
    public AContextual(){
        this.tabla= new TablaSimbolos();
    }

    @Override
    public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        visit(ctx.singleCommand());
        return null;
    }

    @Override public Object visitCommandAST(MiParser.CommandASTContext ctx) {
        visit(ctx.singleCommand(0));
        int i;
        for(i=1; i <= ctx.singleCommand().size()-1; i++) {

            visit(ctx.singleCommand(i));

        }
        return null;
    }

    @Override public Object visitAssignSingleCommandAST(MiParser.AssignSingleCommandASTContext ctx) {
        int tipoID = -1;
        MiParser.IdentASTContext t = (MiParser.IdentASTContext) visit(ctx.ident());
        TablaSimbolos.Ident ident = tabla.buscar(t.IDENT().getSymbol().getText());
        if (ident != null) {
            t.decl = ( MiParser.SingleDeclarationContext ) ident.declCtx;
            tipoID = ident.type;
        }else{
            //TODO: MANEJO DE ERRORES
            System.err.println("Error, el identificador '" + t.IDENT().getText()+"' no ha sido declarado");
        }

        int exp = (int) visit(ctx.expression());
        if(tipoID != exp){
            //TODO: MANEJO DE ERRORES
            System.err.println("Error Assign, tipos incopatibles entre ('" + tipoID + ", " + exp+"')");
        }
        visit(ctx.expression());

        return null;
    }
    @Override public Object visitCallSingleCommandAST(MiParser.CallSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIfSingleCommandAST(MiParser.IfSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitWhileSingleCommandAST(MiParser.WhileSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitLetSingleCommandAST(MiParser.LetSingleCommandASTContext ctx) {
        tabla.openScope();
        visitChildren(ctx);
        tabla.closeScope();
        return null;
    }
    @Override public Object visitBlockSingleCommandAST(MiParser.BlockSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitDeclarationAST(MiParser.DeclarationASTContext ctx) {
        visit(ctx.singleDeclaration(0));
        int i;
        for(i=1; i <= ctx.singleDeclaration().size()-1; i++) {
            visit(ctx.singleDeclaration(i));
        }

        tabla.imprimir();
        return null;
    }
    @Override public Object visitConstSingleDeclarationAST(MiParser.ConstSingleDeclarationASTContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitVarSingleDeclarationAST(MiParser.VarSingleDeclarationASTContext ctx) {
        //TODO: Verificar si existe ya, en el mismo nivel, se reporta un error
        int tipo =(int) visit(ctx.typeDenoter());
        tabla.insertar(ctx.IDENT().getSymbol(),tipo,ctx);
        return null;
    }
    @Override public Object visitTypeDenoterAST(MiParser.TypeDenoterASTContext ctx) {
        if(ctx.IDENT().getText().equals("int")){
            return 0;
        }else if(ctx.IDENT().getText().equals("char")){
            return 1;
        }else{
            //TODO: Hacer el error en caso de que no exista el tipo (Metodo reporte de error)
            System.err.println("Error: Tipo de dato invalido: '" + ctx.IDENT().getText() +"'");
            return -1;
        }

    }

    @Override public Object visitExpressionAST(MiParser.ExpressionASTContext ctx) {
        int tipoExp = -1;

        tipoExp = (int) visit(ctx.primaryExpression(0));
        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            //TODO: Verificar los tipos
            String op =(String) visit(ctx.operator(i-1));
            int tipoTemp = (int) visit(ctx.primaryExpression(i));
            if(tipoExp == 0 && tipoTemp == 0){
                tipoExp = 0;
            }else{
                System.err.println("Error: Tipo incopatibles en la operacion: '" + op +"'");
                tipoExp = -1;
            }
        }

        return tipoExp;

    }
    @Override
    public Object visitNumPrimaryExpressionAST(MiParser.NumPrimaryExpressionASTContext ctx) {
        return 0;
    }

    @Override
    public Object visitIdPrimaryExpressionAST(MiParser.IdPrimaryExpressionASTContext ctx) {
        int idType = -1;
        MiParser.IdentASTContext idCtx =( MiParser.IdentASTContext ) visit(ctx.ident());
        TablaSimbolos.Ident id = tabla.buscar(idCtx.getText());
        if(id != null){
            idType = id.type;
        }else{
            //TODO: MANEJO DE ERRORES
            System.err.println("Error, el identificador '" + idCtx.IDENT().getText()+ "' no ha sido declarado");
        }
        /*int idType=-1;
        MiParser.IdentASTContext idCtx = (MiParser.IdentASTContext) visit(ctx.ident());
        TablaSimbolos.Ident id = tabla.buscar(idCtx.getText());
        if (id!=null)
            idType = id.type;
        else
            System.out.println("El identificador " + idCtx.IDENT().getText() + " no ha sido declarado!!!");
        return idType;*/

        return idType;
    }
    @Override public Object visitGroupPrimaryExpressionAST(MiParser.GroupPrimaryExpressionASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitOperator(MiParser.OperatorContext ctx) {
        String op;
        if (ctx.SUMA()!=null)
            op=ctx.SUMA().getText();
        else if (ctx.RESTA()!=null)
            op=ctx.RESTA().getText();
        else if (ctx.MULT()!=null)
            op=ctx.MULT().getText();
        else
            op=ctx.DIV().getText();
        return op;
    }

    @Override
    public Object visitIdentAST(MiParser.IdentASTContext ctx) {
        //System.out.println(ctx.decl);
        return ctx;
    }
}
