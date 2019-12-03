// Generated from C:\Users\bruno\Desktop\CompiladorC\grammar\parser\GramaticaC.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by the {@code lineWhileLoop}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineWhileLoop(GramaticaCParser.LineWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineWhileLoop}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineWhileLoop(GramaticaCParser.LineWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link GramaticaCParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramaticaCParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link GramaticaCParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramaticaCParser.VarContext ctx);
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
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link GramaticaCParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GramaticaCParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link GramaticaCParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GramaticaCParser.WhileContext ctx);
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
	 * Enter a parse tree produced by the {@code writeID}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteID(GramaticaCParser.WriteIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeID}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteID(GramaticaCParser.WriteIDContext ctx);
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
	 * Enter a parse tree produced by the {@code ifSemElse}
	 * labeled alternative in {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfSemElse(GramaticaCParser.IfSemElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSemElse}
	 * labeled alternative in {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfSemElse(GramaticaCParser.IfSemElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifComElse}
	 * labeled alternative in {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void enterIfComElse(GramaticaCParser.IfComElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifComElse}
	 * labeled alternative in {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 */
	void exitIfComElse(GramaticaCParser.IfComElseContext ctx);
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
	 * Enter a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(GramaticaCParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(GramaticaCParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(GramaticaCParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(GramaticaCParser.ExprSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(GramaticaCParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(GramaticaCParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMul}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMul(GramaticaCParser.TermMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMul}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMul(GramaticaCParser.TermMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermDiv(GramaticaCParser.TermDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermDiv(GramaticaCParser.TermDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMod(GramaticaCParser.TermModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMod(GramaticaCParser.TermModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termFact}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermFact(GramaticaCParser.TermFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termFact}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermFact(GramaticaCParser.TermFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factId}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactId(GramaticaCParser.FactIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factId}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactId(GramaticaCParser.FactIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factNum}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactNum(GramaticaCParser.FactNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factNum}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactNum(GramaticaCParser.FactNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFactExpr(GramaticaCParser.FactExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFactExpr(GramaticaCParser.FactExprContext ctx);
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
	 * Enter a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(GramaticaCParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(GramaticaCParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloat(GramaticaCParser.TypeFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloat(GramaticaCParser.TypeFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDouble}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDouble(GramaticaCParser.TypeDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDouble}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDouble(GramaticaCParser.TypeDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeChar}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeChar(GramaticaCParser.TypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeChar}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeChar(GramaticaCParser.TypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(GramaticaCParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(GramaticaCParser.TypeBoolContext ctx);
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