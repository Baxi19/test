package codeGen;

import generated.MiParser;
import generated.MiParserBaseVisitor;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class CodeGenerator /*extends MiParserBaseVisitor*/{
    /*
    private int letmain;
    private int indice;
    private LinkedList<String> codigo;
    public CodeGenerator() {
        this.letmain=-1;
        this.indice=0;
        this.codigo= new LinkedList<String>();
    }

    private void generar(int indice, String instr, Object param){
        if (param!=null)
            this.codigo.add(indice + " " + instr + " " + param);
        else
            this.codigo.add(indice + " " + instr);
        this.indice++;
    }

    @Override
    public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        visit(ctx.singleCommand());
        System.out.println(this.toString());
        return null;

    }

    @Override
    public Object visitCommandAST(MiParser.CommandASTContext ctx) {
        return super.visitCommandAST(ctx);
    }

    @Override
    public Object visitAssignSingleCommandAST(MiParser.AssignSingleCommandASTContext ctx) {
        visit(ctx.expression());
        this.generar(this.indice,"STORE_FAST",visit(ctx.ident()));
        //debería poder escoger entre LOAD_FAST y LOAD_GLOBAL dependiendo del nivel del ident

        return null;
    }

    @Override
    public Object visitCallSingleCommandAST(MiParser.CallSingleCommandASTContext ctx) {
        if (ctx.expression()==null) {
            this.generar(this.indice, "LOAD_GLOBAL", visit(ctx.ident()));
            this.generar(this.indice, "CALL_FUNCTION", 0);
        }
        else {
            visit(ctx.expression());
            String methodName= (String) visit(ctx.ident());
            if (methodName.equals("print"))
                this.generar(this.indice, "LOAD_GLOBAL", "write");
            else
                this.generar(this.indice, "LOAD_GLOBAL", methodName);
            this.generar(this.indice, "CALL_FUNCTION", 1);
        }
        return null;
    }

    @Override
    public Object visitIfSingleCommandAST(MiParser.IfSingleCommandASTContext ctx) {
        return super.visitIfSingleCommandAST(ctx);
    }

    @Override
    public Object visitWhileSingleCommandAST(MiParser.WhileSingleCommandASTContext ctx) {
        return super.visitWhileSingleCommandAST(ctx);
    }

    @Override
    public Object visitLetSingleCommandAST(MiParser.LetSingleCommandASTContext ctx) {
        this.letmain++;
        visit(ctx.declaration());
        if (this.letmain==0) {
            this.generar(this.indice,"DEF","Main");
            visit(ctx.singleCommand());
            this.generar(this.indice,"END",null);
        }
        else
            visit(ctx.singleCommand());
        this.letmain--;
        return null;
    }

    @Override
    public Object visitBlockSingleCommandAST(MiParser.BlockSingleCommandASTContext ctx) {
        return super.visitBlockSingleCommandAST(ctx);
    }

    @Override
    public Object visitDeclarationAST(MiParser.DeclarationASTContext ctx) {
        return super.visitDeclarationAST(ctx);
    }

    @Override
    public Object visitConstSingleDeclarationAST(MiParser.ConstSingleDeclarationASTContext ctx) {
        return super.visitConstSingleDeclarationAST(ctx);
    }

    @Override
    public Object visitVarSingleDeclarationAST(MiParser.VarSingleDeclarationASTContext ctx) {
        if (this.letmain==0)
            this.generar(this.indice,"PUSH_GLOBAL_I",ctx.IDENT().getText());
        else
            this.generar(this.indice,"PUSH_LOCAL_I",ctx.IDENT().getText());

        return null;
    }

    @Override
    public Object visitMethodSingleDeclarationAST(MiParser.MethodSingleDeclarationASTContext ctx) {
        return super.visitMethodSingleDeclarationAST(ctx);
    }

    @Override
    public Object visitMethodDeclararionAST(MiParser.MethodDeclararionASTContext ctx) {
        this.generar(this.indice,"DEF",visit(ctx.ident()));
        visit(ctx.singleCommand());
        this.generar(this.indice,"RETURN",null); //puede ser RETURN_VALUE
        return null;
    }

    @Override
    public Object visitTypeDenoterAST(MiParser.TypeDenoterASTContext ctx) {
        return super.visitTypeDenoterAST(ctx);
    }

    @Override
    public Object visitExpressionAST(MiParser.ExpressionASTContext ctx) {
        visit(ctx.primaryExpression(0));
        int i;
        for(i=1; i <= ctx.primaryExpression().size()-1; i++) {
            visit(ctx.primaryExpression(i));
            this.generar(this.indice,"BINARY_ADD",null);
        }
        return null;
    }

    @Override
    public Object visitNumPrimaryExpressionAST(MiParser.NumPrimaryExpressionASTContext ctx) {
        this.generar(this.indice,"LOAD_CONST",ctx.LITERAL().getText());
        return null;
    }

    @Override
    public Object visitIdPrimaryExpressionAST(MiParser.IdPrimaryExpressionASTContext ctx) {
        this.generar(this.indice,"LOAD_FAST",visit(ctx.ident()));
        //debería poder escoger entre LOAD_FAST y LOAD_GLOBAL dependiendo del nivel del ident
        return null;
    }

    @Override
    public Object visitCallPrimaryExpression(MiParser.CallPrimaryExpressionContext ctx) {
        return super.visitCallPrimaryExpression(ctx);
    }

    @Override
    public Object visitGroupPrimaryExpressionAST(MiParser.GroupPrimaryExpressionASTContext ctx) {
        return super.visitGroupPrimaryExpressionAST(ctx);
    }

    @Override
    public Object visitOperator(MiParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }

    @Override
    public Object visitIdentAST(MiParser.IdentASTContext ctx) {
        return ctx.IDENT().getText();
    }

    @Override
    public String toString() {
        String result="";
        for (String s : codigo){
            result+= s + '\n';
        }
        return result;
    }*/
}
