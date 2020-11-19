package codeGen;

import generated.MiParser;
import generated.MiParserBaseVisitor;

import java.util.LinkedList;

public class CodeGeneration1 extends MiParserBaseVisitor {
    private int letMain;
    private int index;
    private LinkedList<String> code;

    public CodeGeneration1() {
        this.letMain = -1;
        this.index = 0;
        this.code = new LinkedList<>();
    }

    private void generate(int index, String instruction, Object param){
        if(param != null){
            this.code.add(index +" "+ instruction + " " +param );
        }else{
            this.code.add(index +" "+ instruction);
        }
        this.index++;
    }

    @Override
    public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        visit(ctx.singleCommand());
        System.out.println(toString());

        return null;
    }

    @Override
    public Object visitCommandAST(MiParser.CommandASTContext ctx) {
        return super.visitCommandAST(ctx);
    }

    @Override
    public Object visitAssignSingleCommandAST(MiParser.AssignSingleCommandASTContext ctx) {
        visit(ctx.expression());
        //deberia poder escoger entre load fast y load global para escoger dependiendo del nivel
        generate(this.index, "STORE_FAST", visit(ctx.ident()));

        return null;
    }

    @Override
    public Object visitCallSingleCommandAST(MiParser.CallSingleCommandASTContext ctx) {
        if(ctx.expression() == null){
            generate(index, "LOAD_GLOBAL" , visit(ctx.ident()));
            generate(index, "CALL_FUNCTION" ,0);
        }else{
            visit(ctx.expression());
            String methodName = (String ) visit(ctx.ident());
            if(methodName.equals("print")){
                generate(index, "LOAD_GLOBAL" , "write");
            }else{
                generate(index, "LOAD_GLOBAL" , methodName);
            }

            //TODO: Cantidad de parametros quemadso, se dede cambiar
            generate(index, "CALL_FUNCTION" ,1);
        }

        return super.visitCallSingleCommandAST(ctx);
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
        // se declara las variables
        letMain ++;
        visit(ctx.declaration());

        if(letMain == 0){
            this.generate(this.index, "DEF", "Main");
            // Luego se usan, el orden es muy importante
            visit(ctx.singleCommand());
            this.generate(this.index, "END", null);
        }else{
            // Luego se usan, el orden es muy importante
            visit(ctx.singleCommand());
        }

        letMain --;

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

        if(this.letMain == 0){
            generate(this.index, "PUSH_GLOBAL_I", ctx.IDENT().getText());
        }else{
            generate(this.index, "PUSH_LOCAL_I", ctx.IDENT().getText());
        }
        return null;
    }

    @Override
    public Object visitMethodSingleDeclarationAST(MiParser.MethodSingleDeclarationASTContext ctx) {
        return super.visitMethodSingleDeclarationAST(ctx);
    }

    @Override
    public Object visitMethodDeclarationAST(MiParser.MethodDeclarationASTContext ctx) {
        generate(this.index, "DEF", visit(ctx.ident()));
        visit(ctx.singleCommand());
        generate(this.index, "RETURN", null);
        return null;
    }

    @Override
    public Object visitTypeDenoterAST(MiParser.TypeDenoterASTContext ctx) {
        return super.visitTypeDenoterAST(ctx);
    }

    @Override
    public Object visitExpressionAST(MiParser.ExpressionASTContext ctx) {
        visit(ctx.primaryExpression(0));
        for (int i = 1; i < ctx.primaryExpression().size(); i++) {
            visit(ctx.primaryExpression(i));
            //se devberia obtener el texto del operador
            this.generate(this.index, "BINARY_ADD", null);
        }
        return null;
    }

    @Override
    public Object visitNumPrimaryExpressionAST(MiParser.NumPrimaryExpressionASTContext ctx) {
        generate(this.index, "LOAD_CONST", ctx.LITERAL().getText());
        return super.visitNumPrimaryExpressionAST(ctx);
    }

    @Override
    public Object visitIdPrimaryExpressionAST(MiParser.IdPrimaryExpressionASTContext ctx) {
        generate(this.index, "LOAD_FAST", visit(ctx.ident()));
        //deberia poder escoger entre load fast y load global para escoger dependiendo del nivel
        return null;
    }

    @Override
    public Object visitGroupPrimaryExpressionAST(MiParser.GroupPrimaryExpressionASTContext ctx) {
        return super.visitGroupPrimaryExpressionAST(ctx);
    }

    @Override
    public Object visitCallPrimaryExpressionAST(MiParser.CallPrimaryExpressionASTContext ctx) {

        return null;
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
        String data = "";
        for (int i = 0; i < code.size() ; i++) {
            data += code.get(i) + "\n";
        }
        return data;
    }
}
