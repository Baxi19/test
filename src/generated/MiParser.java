// Generated from C:/Users/Baxi/Desktop/Compi/tests\MiParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, DOSPUNTOS=2, ASIGN=3, PIZQ=4, PDER=5, VIR=6, SUMA=7, RESTA=8, 
		MULT=9, DIV=10, FN=11, IF=12, THEN=13, ELSE=14, WHILE=15, DO=16, LET=17, 
		IN=18, BEGIN=19, END=20, CONST=21, VAR=22, IDENT=23, LITERAL=24, WS=25;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_methodDeclaration = 5, RULE_typeDenoter = 6, 
		RULE_expression = 7, RULE_primaryExpression = 8, RULE_operator = 9, RULE_ident = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"methodDeclaration", "typeDenoter", "expression", "primaryExpression", 
			"operator", "ident"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "':='", "'('", "')'", "'~'", "'+'", "'-'", "'*'", 
			"'/'", "'fn'", "'if'", "'then'", "'else'", "'while'", "'do'", "'let'", 
			"'in'", "'begin'", "'end'", "'const'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "DOSPUNTOS", "ASIGN", "PIZQ", "PDER", "VIR", "SUMA", 
			"RESTA", "MULT", "DIV", "FN", "IF", "THEN", "ELSE", "WHILE", "DO", "LET", 
			"IN", "BEGIN", "END", "CONST", "VAR", "IDENT", "LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			singleCommand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandASTContext extends CommandContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(MiParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(MiParser.PyCOMA, i);
		}
		public CommandASTContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			_localctx = new CommandASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			singleCommand();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(25);
				match(PyCOMA);
				setState(26);
				singleCommand();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleCommandContext extends ParserRuleContext {
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	 
		public SingleCommandContext() { }
		public void copyFrom(SingleCommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfSingleCommandASTContext extends SingleCommandContext {
		public TerminalNode IF() { return getToken(MiParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiParser.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiParser.ELSE, 0); }
		public IfSingleCommandASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitIfSingleCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignSingleCommandASTContext extends SingleCommandContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode ASIGN() { return getToken(MiParser.ASIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignSingleCommandASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitAssignSingleCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileSingleCommandASTContext extends SingleCommandContext {
		public TerminalNode WHILE() { return getToken(MiParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiParser.DO, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public WhileSingleCommandASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitWhileSingleCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetSingleCommandASTContext extends SingleCommandContext {
		public TerminalNode LET() { return getToken(MiParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(MiParser.IN, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public LetSingleCommandASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitLetSingleCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockSingleCommandASTContext extends SingleCommandContext {
		public TerminalNode BEGIN() { return getToken(MiParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(MiParser.END, 0); }
		public BlockSingleCommandASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBlockSingleCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallSingleCommandASTContext extends SingleCommandContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MiParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParser.PDER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallSingleCommandASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCallSingleCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignSingleCommandASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				ident();
				setState(33);
				match(ASIGN);
				setState(34);
				expression();
				}
				break;
			case 2:
				_localctx = new CallSingleCommandASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				ident();
				setState(37);
				match(PIZQ);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
					{
					setState(38);
					expression();
					}
				}

				setState(41);
				match(PDER);
				}
				break;
			case 3:
				_localctx = new IfSingleCommandASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(IF);
				setState(44);
				expression();
				setState(45);
				match(THEN);
				setState(46);
				singleCommand();
				setState(47);
				match(ELSE);
				setState(48);
				singleCommand();
				}
				break;
			case 4:
				_localctx = new WhileSingleCommandASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(WHILE);
				setState(51);
				expression();
				setState(52);
				match(DO);
				setState(53);
				singleCommand();
				}
				break;
			case 5:
				_localctx = new LetSingleCommandASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(LET);
				setState(56);
				declaration();
				setState(57);
				match(IN);
				setState(58);
				singleCommand();
				}
				break;
			case 6:
				_localctx = new BlockSingleCommandASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				match(BEGIN);
				setState(61);
				command();
				setState(62);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationASTContext extends DeclarationContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(MiParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(MiParser.PyCOMA, i);
		}
		public DeclarationASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			singleDeclaration();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(67);
				match(PyCOMA);
				setState(68);
				singleDeclaration();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDeclarationContext extends ParserRuleContext {
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	 
		public SingleDeclarationContext() { }
		public void copyFrom(SingleDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodSingleDeclarationASTContext extends SingleDeclarationContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodSingleDeclarationASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMethodSingleDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstSingleDeclarationASTContext extends SingleDeclarationContext {
		public TerminalNode CONST() { return getToken(MiParser.CONST, 0); }
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TerminalNode VIR() { return getToken(MiParser.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstSingleDeclarationASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitConstSingleDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarSingleDeclarationASTContext extends SingleDeclarationContext {
		public TerminalNode VAR() { return getToken(MiParser.VAR, 0); }
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(MiParser.DOSPUNTOS, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public VarSingleDeclarationASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitVarSingleDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstSingleDeclarationASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(CONST);
				setState(75);
				match(IDENT);
				setState(76);
				match(VIR);
				setState(77);
				expression();
				}
				break;
			case VAR:
				_localctx = new VarSingleDeclarationASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(VAR);
				setState(79);
				match(IDENT);
				setState(80);
				match(DOSPUNTOS);
				setState(81);
				typeDenoter();
				}
				break;
			case FN:
				_localctx = new MethodSingleDeclarationASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				methodDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclarationASTContext extends MethodDeclarationContext {
		public TerminalNode FN() { return getToken(MiParser.FN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MiParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParser.PDER, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(MiParser.DOSPUNTOS, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public MethodDeclarationASTContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMethodDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		try {
			_localctx = new MethodDeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FN);
			setState(86);
			ident();
			setState(87);
			match(PIZQ);
			setState(88);
			match(PDER);
			setState(89);
			match(DOSPUNTOS);
			setState(90);
			typeDenoter();
			setState(91);
			singleCommand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDenoterContext extends ParserRuleContext {
		public TypeDenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDenoter; }
	 
		public TypeDenoterContext() { }
		public void copyFrom(TypeDenoterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeDenoterASTContext extends TypeDenoterContext {
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TypeDenoterASTContext(TypeDenoterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitTypeDenoterAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDenoterContext typeDenoter() throws RecognitionException {
		TypeDenoterContext _localctx = new TypeDenoterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeDenoter);
		try {
			_localctx = new TypeDenoterASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			primaryExpression();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULT) | (1L << DIV))) != 0)) {
				{
				{
				setState(96);
				operator();
				setState(97);
				primaryExpression();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupPrimaryExpressionASTContext extends PrimaryExpressionContext {
		public TerminalNode PIZQ() { return getToken(MiParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiParser.PDER, 0); }
		public GroupPrimaryExpressionASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitGroupPrimaryExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallPrimaryExpressionASTContext extends PrimaryExpressionContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MiParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParser.PDER, 0); }
		public CallPrimaryExpressionASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCallPrimaryExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumPrimaryExpressionASTContext extends PrimaryExpressionContext {
		public TerminalNode LITERAL() { return getToken(MiParser.LITERAL, 0); }
		public NumPrimaryExpressionASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitNumPrimaryExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdPrimaryExpressionASTContext extends PrimaryExpressionContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IdPrimaryExpressionASTContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitIdPrimaryExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primaryExpression);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new NumPrimaryExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(LITERAL);
				}
				break;
			case 2:
				_localctx = new IdPrimaryExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				ident();
				}
				break;
			case 3:
				_localctx = new GroupPrimaryExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(PIZQ);
				setState(107);
				expression();
				setState(108);
				match(PDER);
				}
				break;
			case 4:
				_localctx = new CallPrimaryExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				ident();
				setState(111);
				match(PIZQ);
				setState(112);
				match(PDER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(MiParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(MiParser.RESTA, 0); }
		public TerminalNode MULT() { return getToken(MiParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MiParser.DIV, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULT) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public SingleDeclarationContext decl = null;
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	 
		public IdentContext() { }
		public void copyFrom(IdentContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class IdentASTContext extends IdentContext {
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public IdentASTContext(IdentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitIdentAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ident);
		try {
			_localctx = new IdentASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4*\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\5\3\5\3\5\7\5H\n"+
		"\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\tf\n\t\f\t\16\ti\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n\n\3\13\3\13\3\f\3\f"+
		"\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\t\f\2}\2\30\3\2\2\2\4\32"+
		"\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16_\3\2\2\2\20a\3"+
		"\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26x\3\2\2\2\30\31\5\6\4\2\31\3\3\2\2\2"+
		"\32\37\5\6\4\2\33\34\7\3\2\2\34\36\5\6\4\2\35\33\3\2\2\2\36!\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37\3\2\2\2\"#\5\26\f\2#$\7\5\2\2$"+
		"%\5\20\t\2%C\3\2\2\2&\'\5\26\f\2\')\7\6\2\2(*\5\20\t\2)(\3\2\2\2)*\3\2"+
		"\2\2*+\3\2\2\2+,\7\7\2\2,C\3\2\2\2-.\7\16\2\2./\5\20\t\2/\60\7\17\2\2"+
		"\60\61\5\6\4\2\61\62\7\20\2\2\62\63\5\6\4\2\63C\3\2\2\2\64\65\7\21\2\2"+
		"\65\66\5\20\t\2\66\67\7\22\2\2\678\5\6\4\28C\3\2\2\29:\7\23\2\2:;\5\b"+
		"\5\2;<\7\24\2\2<=\5\6\4\2=C\3\2\2\2>?\7\25\2\2?@\5\4\3\2@A\7\26\2\2AC"+
		"\3\2\2\2B\"\3\2\2\2B&\3\2\2\2B-\3\2\2\2B\64\3\2\2\2B9\3\2\2\2B>\3\2\2"+
		"\2C\7\3\2\2\2DI\5\n\6\2EF\7\3\2\2FH\5\n\6\2GE\3\2\2\2HK\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2J\t\3\2\2\2KI\3\2\2\2LM\7\27\2\2MN\7\31\2\2NO\7\b\2\2OV"+
		"\5\20\t\2PQ\7\30\2\2QR\7\31\2\2RS\7\4\2\2SV\5\16\b\2TV\5\f\7\2UL\3\2\2"+
		"\2UP\3\2\2\2UT\3\2\2\2V\13\3\2\2\2WX\7\r\2\2XY\5\26\f\2YZ\7\6\2\2Z[\7"+
		"\7\2\2[\\\7\4\2\2\\]\5\16\b\2]^\5\6\4\2^\r\3\2\2\2_`\7\31\2\2`\17\3\2"+
		"\2\2ag\5\22\n\2bc\5\24\13\2cd\5\22\n\2df\3\2\2\2eb\3\2\2\2fi\3\2\2\2g"+
		"e\3\2\2\2gh\3\2\2\2h\21\3\2\2\2ig\3\2\2\2ju\7\32\2\2ku\5\26\f\2lm\7\6"+
		"\2\2mn\5\20\t\2no\7\7\2\2ou\3\2\2\2pq\5\26\f\2qr\7\6\2\2rs\7\7\2\2su\3"+
		"\2\2\2tj\3\2\2\2tk\3\2\2\2tl\3\2\2\2tp\3\2\2\2u\23\3\2\2\2vw\t\2\2\2w"+
		"\25\3\2\2\2xy\7\31\2\2y\27\3\2\2\2\t\37)BIUgt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}