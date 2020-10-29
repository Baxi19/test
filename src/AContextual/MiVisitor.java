package AContextual;

import generated.MiParser;
import generated.MiParserBaseVisitor;

public class MiVisitor extends MiParserBaseVisitor<Object> {

    private int cantTabs=0;

    private String printTabs(int cantTabs){
        String res="";
        for(int i=0; i< cantTabs;i++)
            res+="\t";
        return res;
    }

    private TablaSimbolos tabla;
    public MiVisitor(){
        this.tabla= new TablaSimbolos();
    }

    @Override public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        visit(ctx.singleCommand());
        cantTabs--;
        return null;
    }

    @Override public Object visitCommandAST(MiParser.CommandASTContext ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        visit(ctx.singleCommand(0));
        cantTabs--;
        int i;
        for(i=1; i <= ctx.singleCommand().size()-1; i++) {
            cantTabs++;
            visit(ctx.singleCommand(i));
            cantTabs--;
        }
        return null;
    }

    @Override public Object visitAssignSingleCommandAST(MiParser.AssignSingleCommandASTContext ctx) {
     /*   System.out.println(ctx.getClass().getSimpleName());
        MiParser.IdentASTContext t = (MiParser.IdentASTContext) visit(ctx.ident());
        main.TablaSimbolos.Ident ident = tabla.buscar(t.IDENT().getSymbol().getText());
        if (ident != null)
            t.decl = (MiParser.SingleDeclarationContext) ident.declCtx;

        visit(ctx.ident());
        cantTabs++;
        visit(ctx.expression());
        cantTabs--;*/
        return null;
    }
    @Override public Object visitCallSingleCommandAST(MiParser.CallSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIfSingleCommandAST(MiParser.IfSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitWhileSingleCommandAST(MiParser.WhileSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitLetSingleCommandAST(MiParser.LetSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitBlockSingleCommandAST(MiParser.BlockSingleCommandASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitDeclarationAST(MiParser.DeclarationASTContext ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        visit(ctx.singleDeclaration(0));
        cantTabs--;
        int i;
        for(i=1; i <= ctx.singleDeclaration().size()-1; i++) {
            cantTabs++;
            visit(ctx.singleDeclaration(i));
            cantTabs--;
        }

        tabla.imprimir();
        return null;
    }
    @Override public Object visitConstSingleDeclarationAST(MiParser.ConstSingleDeclarationASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitVarSingleDeclarationAST(MiParser.VarSingleDeclarationASTContext ctx) {
        tabla.insertar(ctx.IDENT().getSymbol(),0,ctx);
        return null;
    }
    @Override public Object visitTypeDenoterAST(MiParser.TypeDenoterASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExpressionAST(MiParser.ExpressionASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitNumPrimaryExpressionAST(MiParser.NumPrimaryExpressionASTContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIdPrimaryExpressionAST(MiParser.IdPrimaryExpressionASTContext ctx) { return visitChildren(ctx); }
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

        System.out.println(op);
        return null;
    }

    @Override
    public Object visitIdentAST(MiParser.IdentASTContext ctx) {
        System.out.println(ctx.decl);
        return ctx;
    }
}
