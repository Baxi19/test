// Generated from C:/Users/Baxi/Desktop/Compi/tests\MiParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(MiParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link MiParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAST(MiParser.CommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignSingleCommandAST}
	 * labeled alternative in {@link MiParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSingleCommandAST(MiParser.AssignSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callSingleCommandAST}
	 * labeled alternative in {@link MiParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSingleCommandAST(MiParser.CallSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSingleCommandAST}
	 * labeled alternative in {@link MiParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSingleCommandAST(MiParser.IfSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSingleCommandAST}
	 * labeled alternative in {@link MiParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSingleCommandAST(MiParser.WhileSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letSingleCommandAST}
	 * labeled alternative in {@link MiParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetSingleCommandAST(MiParser.LetSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSingleCommandAST}
	 * labeled alternative in {@link MiParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSingleCommandAST(MiParser.BlockSingleCommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link MiParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAST(MiParser.DeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constSingleDeclarationAST}
	 * labeled alternative in {@link MiParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSingleDeclarationAST(MiParser.ConstSingleDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSingleDeclarationAST}
	 * labeled alternative in {@link MiParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSingleDeclarationAST(MiParser.VarSingleDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDenoterAST}
	 * labeled alternative in {@link MiParser#typeDenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDenoterAST(MiParser.TypeDenoterASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link MiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(MiParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPrimaryExpressionAST}
	 * labeled alternative in {@link MiParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPrimaryExpressionAST(MiParser.NumPrimaryExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPrimaryExpressionAST}
	 * labeled alternative in {@link MiParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPrimaryExpressionAST(MiParser.IdPrimaryExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupPrimaryExpressionAST}
	 * labeled alternative in {@link MiParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupPrimaryExpressionAST(MiParser.GroupPrimaryExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(MiParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identAST}
	 * labeled alternative in {@link MiParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentAST(MiParser.IdentASTContext ctx);
}