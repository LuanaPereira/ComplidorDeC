// Generated from C:\Users\bruno\Desktop\CompiladorC\grammar\parser\GramaticaC.g4 by ANTLR 4.6
 package compiladorc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaCParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(GramaticaCParser.IncludesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#globais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobais(GramaticaCParser.GlobaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(GramaticaCParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GramaticaCParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GramaticaCParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GramaticaCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineRead}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineRead(GramaticaCParser.LineReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineWrite}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWrite(GramaticaCParser.LineWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineAtr}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineAtr(GramaticaCParser.LineAtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineIfStm}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineIfStm(GramaticaCParser.LineIfStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linefunc}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinefunc(GramaticaCParser.LinefuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code linevars}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinevars(GramaticaCParser.LinevarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineWhileLoop}
	 * labeled alternative in {@link GramaticaCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWhileLoop(GramaticaCParser.LineWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link GramaticaCParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GramaticaCParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GramaticaCParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link GramaticaCParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GramaticaCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(GramaticaCParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStr}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStr(GramaticaCParser.WriteStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeID}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteID(GramaticaCParser.WriteIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link GramaticaCParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExpr(GramaticaCParser.WriteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSemElse}
	 * labeled alternative in {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSemElse(GramaticaCParser.IfSemElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifComElse}
	 * labeled alternative in {@link GramaticaCParser#ifstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfComElse(GramaticaCParser.IfComElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtr(GramaticaCParser.AtrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdd}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(GramaticaCParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(GramaticaCParser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link GramaticaCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(GramaticaCParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMul}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMul(GramaticaCParser.TermMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiv(GramaticaCParser.TermDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMod}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMod(GramaticaCParser.TermModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termFact}
	 * labeled alternative in {@link GramaticaCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermFact(GramaticaCParser.TermFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factId}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactId(GramaticaCParser.FactIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factNum}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactNum(GramaticaCParser.FactNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factExpr}
	 * labeled alternative in {@link GramaticaCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactExpr(GramaticaCParser.FactExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(GramaticaCParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(GramaticaCParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(GramaticaCParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(GramaticaCParser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDouble}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDouble(GramaticaCParser.TypeDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeChar}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChar(GramaticaCParser.TypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link GramaticaCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(GramaticaCParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaCParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(GramaticaCParser.IdsContext ctx);
}