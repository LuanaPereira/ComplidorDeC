// Generated from /home/mayla/NetBeansProjects/CompiladorC/grammar/parser/GramaticaC.g4 by ANTLR 4.6
 package compiladorc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaCParser}.
 */
public interface GramaticaCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaCParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaCParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(GramaticaCParser.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(GramaticaCParser.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#globais}.
	 * @param ctx the parse tree
	 */
	void enterGlobais(GramaticaCParser.GlobaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#globais}.
	 * @param ctx the parse tree
	 */
	void exitGlobais(GramaticaCParser.GlobaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(GramaticaCParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(GramaticaCParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(GramaticaCParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(GramaticaCParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GramaticaCParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GramaticaCParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GramaticaCParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GramaticaCParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GramaticaCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GramaticaCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineRead(GramaticaCParser.LineReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineRead(GramaticaCParser.LineReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineWrite(GramaticaCParser.LineWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineWrite(GramaticaCParser.LineWriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineAtr(GramaticaCParser.LineAtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineAtr(GramaticaCParser.LineAtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineIfStm(GramaticaCParser.LineIfStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineIfStm(GramaticaCParser.LineIfStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linefunc}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLinefunc(GramaticaCParser.LinefuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linefunc}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLinefunc(GramaticaCParser.LinefuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linevars}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLinevars(GramaticaCParser.LinevarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linevars}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLinevars(GramaticaCParser.LinevarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GramaticaCParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GramaticaCParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GramaticaCParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GramaticaCParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteStr(GramaticaCParser.WriteStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteStr(GramaticaCParser.WriteStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteExpr(GramaticaCParser.WriteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteExpr(GramaticaCParser.WriteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(GramaticaCParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(GramaticaCParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfstm(GramaticaCParser.IfstmContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfstm(GramaticaCParser.IfstmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GramaticaCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GramaticaCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GramaticaCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GramaticaCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(GramaticaCParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(GramaticaCParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(GramaticaCParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(GramaticaCParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(GramaticaCParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(GramaticaCParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramaticaCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramaticaCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaCParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(GramaticaCParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaCParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(GramaticaCParser.IdsContext ctx);
}