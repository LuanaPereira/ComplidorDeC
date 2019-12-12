/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorc;

import compiladorc.parser.GramaticaCBaseVisitor;
import compiladorc.parser.GramaticaCLexer;
import compiladorc.parser.GramaticaCParser;
import compiladorc.parser.GramaticaCVisitor;
import java.util.Scanner;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Luana
 */
public class MyGramaticaCVisitor extends GramaticaCBaseVisitor<Object> {
        //@Override public Object visitMain(GramaticaCParser.MainContext ctx) { return visitChildren(ctx); }
	//@Override public Object visitTypeInt(GramaticaCParser.TypeIntContext ctx) { return visitChildren(ctx); }
	//@Override public Object visitTypeFloat(GramaticaCParser.TypeFloatContext ctx) { return visitChildren(ctx); }
	//@Override public Object visitTypeDouble(GramaticaCParser.TypeDoubleContext ctx) { return visitChildren(ctx); }
	//@Override public Object visitTypeChar(GramaticaCParser.TypeCharContext ctx) { return visitChildren(ctx); }
	//@Override public Object visitTypeBool(GramaticaCParser.TypeBoolContext ctx) { return visitChildren(ctx); }
        //@Override public Object visitPrograma(GramaticaCParser.ProgramaContext ctx) { return visitChildren(ctx); }
	//@Override public Object visitIncludes(GramaticaCParser.IncludesContext ctx) { return visitChildren(ctx); }
   
    @Override
    public Object visitGlobais(GramaticaCParser.GlobaisContext ctx) {

        return 0;
    }


	

    @Override
    public Object visitLinefunc(GramaticaCParser.LinefuncContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Object visitFunctions(GramaticaCParser.FunctionsContext ctx) {
       visitFunction((GramaticaCParser.FunctionContext) ctx.function(0));
        return 0;
    }
    @Override
    public Object visitFunction(GramaticaCParser.FunctionContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Object visitFunc(GramaticaCParser.FuncContext ctx) {
        return visitChildren(ctx);
    }

        
        
        
        
        
        
        
        
        
    
    
    
    
    
    
      @Override
    public Object visitIds(GramaticaCParser.IdsContext ctx) {
        return ctx.ID().toString();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLineWrite(GramaticaCParser.LineWriteContext ctx) {
        visit(ctx.write());
        return 0;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWriteStr(GramaticaCParser.WriteStrContext ctx) {
        String val = ctx.STR().getText().replace("\"", "");
        System.out.println(val);
        return 0;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWriteExpr(GramaticaCParser.WriteExprContext ctx) {
        Double resultado = (Double) visit(ctx.expr());
        System.out.println(resultado);
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWriteID(GramaticaCParser.WriteIDContext ctx) {
        Object[] printId = SymbolsTable.getInstance().getSymbol(ctx.ID().getText());
        System.out.println(printId[1]);
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExprAdd(GramaticaCParser.ExprAddContext ctx) {
        Object segundo = (Object) visit(ctx.term());
        Object primeiro = (Object) visit(ctx.expr());
        Double valor2 = Double.parseDouble(segundo.toString());
        Double valor1 = Double.parseDouble(primeiro.toString());
        return valor2 + valor1;
    }

    @Override
    public Object visitExprSub(GramaticaCParser.ExprSubContext ctx) {
        Object segundo = (Object) visit(ctx.term());
        Object primeiro = (Object) visit(ctx.expr());
        Double valor2 = Double.parseDouble(segundo.toString());
        Double valor1 = Double.parseDouble(primeiro.toString());
        return valor1 - valor2;
    }

    @Override
    public Object visitExprTerm(GramaticaCParser.ExprTermContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public Object visitTermMul(GramaticaCParser.TermMulContext ctx) {
        Object segundo = (Object) visit(ctx.term());
        Object primeiro = (Object) visit(ctx.fact());
        Double valor2 = Double.parseDouble(segundo.toString());
        Double valor1 = Double.parseDouble(primeiro.toString());
        return valor1 * valor2;
    }

    @Override
    public Object visitTermDiv(GramaticaCParser.TermDivContext ctx) {
        Object segundo = (Object) visit(ctx.term());
        Object primeiro = (Object) visit(ctx.fact());
        Double valor2 = Double.parseDouble(segundo.toString());
        Double valor1 = Double.parseDouble(primeiro.toString());
        return valor1 / valor2;
    }

    @Override
    public Object visitTermMod(GramaticaCParser.TermModContext ctx) {
        Object segundo = (Object) visit(ctx.term());
        Object primeiro = (Object) visit(ctx.fact());
        Double valor2 = Double.parseDouble(segundo.toString());
        Double valor1 = Double.parseDouble(primeiro.toString());
        return valor1 % valor2;
    }

    @Override
    public Object visitTermFact(GramaticaCParser.TermFactContext ctx) {
        return visit(ctx.fact());
    }

    @Override
    public Object visitFactId(GramaticaCParser.FactIdContext ctx) {
        Object[] aux = SymbolsTable.getInstance().getSymbol(ctx.ID().getText());
        return aux[1];

    }

    @Override
    public Object visitFactNum(GramaticaCParser.FactNumContext ctx) {
        String valor = ctx.NUM().getText();
        double valor1 = Double.parseDouble(valor);

        return valor1;
    }

    @Override
    public Object visitFactExpr(GramaticaCParser.FactExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitLineAtr(GramaticaCParser.LineAtrContext ctx) {

        visitAtr(ctx.atr());
        return 0;
    }

    @Override
    public Object visitAtr(GramaticaCParser.AtrContext ctx) {
        Object[] aux = new Object[2];
        aux = SymbolsTable.getInstance().getSymbol(ctx.ID().getText());
        aux[1] = visit(ctx.expr());
        //System.out.println("ID: " + ctx.ID().getText());
        //System.out.println("Tipo: " + aux[0]);
        //System.out.println("Valor: " + aux[1]);
        SymbolsTable.getInstance().addSymbol(ctx.ID().getText(), aux);
        return 0;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitLinevars(GramaticaCParser.LinevarsContext ctx) {
        Object[] aux = new Object[2];
        String resposta = visitVar((GramaticaCParser.VarContext) ctx.vars()).toString();
        String sep[] = resposta.split("-");
        aux[0] = sep[0];
        SymbolsTable.getInstance().addSymbol(sep[1], aux);
        return 0;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitVar(GramaticaCParser.VarContext ctx) {
        return ctx.type().getText() + "-" + visitIds(ctx.ids());
    }

    @Override
    public Object visitLineRead(GramaticaCParser.LineReadContext ctx) {
        visitRead(ctx.read());
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitRead(GramaticaCParser.ReadContext ctx) {
        Scanner leitura = new Scanner(System.in);
        Object[] value = new Object[2];
        value = SymbolsTable.getInstance().getSymbol(ctx.ID().toString());
        if (value[0].equals("int")) {
            value[1] = leitura.nextInt();
        } else if (value[0].equals("double")) {
            value[1] = leitura.nextDouble();
        } else if (value[0].equals("float")) {
            value[1] = leitura.nextFloat();
        } else if (value[0].equals("char")) {
            value[1] = leitura.nextLine();
        } else if (value[0].equals("bool")) {
            value[1] = leitura.nextBoolean();
        }
        return 0;
    }

    @Override
    public Object visitBoolExpr(GramaticaCParser.BoolExprContext ctx) {
        Object c = (Object) visit(ctx.fact(0));
        Object d = (Object) visit(ctx.fact(1));
        Double a = Double.parseDouble(c.toString());
        Double b = Double.parseDouble(d.toString());
        int op = valueComp((String) visitRelop(ctx.relop()));
        switch (op) {
            case GramaticaCLexer.EQ:
                return a.equals(b);
            case GramaticaCLexer.NEQ:
                return !a.equals(b);
            case GramaticaCLexer.LS:
                return a < b;
            case GramaticaCLexer.GR:
                return a > b;
            case GramaticaCLexer.LST:
                return a <= b;
            case GramaticaCLexer.GRT:
                return a >= b;
            case -1:
                System.out.println("Comparação errada");
        }
        return null;
    }

    @Override
    public Object visitRelop(GramaticaCParser.RelopContext ctx) {
        return ctx.getText();
    }

    public int valueComp(String aux) {
        if (aux.equals("==")) {
            return GramaticaCLexer.EQ;
        } else if (aux.equals("!=")) {
            return GramaticaCLexer.NEQ;
        } else if (aux.equals(">")) {
            return GramaticaCLexer.GR;
        } else if (aux.equals("<")) {
            return GramaticaCLexer.LS;
        } else if (aux.equals(">=")) {
            return GramaticaCLexer.GRT;
        } else if (aux.equals("<=")) {
            return GramaticaCLexer.LST;
        }
        return -1;
    }

    @Override
    public Object visitBlock(GramaticaCParser.BlockContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Object visitLineIfStm(GramaticaCParser.LineIfStmContext ctx) {
        return visit(ctx.ifstm());
    }

    @Override
    public Object visitIfSemElse(GramaticaCParser.IfSemElseContext ctx) {
        boolean comparacao = (boolean) visitBoolExpr(ctx.boolExpr());
        if (comparacao) {
            visit(ctx.block());
        }
        return 0;
    }

    @Override
    public Object visitIfComElse(GramaticaCParser.IfComElseContext ctx) {
        boolean comparacao = (boolean) visitBoolExpr(ctx.boolExpr());
        if (comparacao) {
            visit(ctx.block(0));
        } else {
            visit(ctx.block(1));
        }
        return 0;
    }

    @Override
    public Object visitLineWhileLoop(GramaticaCParser.LineWhileLoopContext ctx) {
        visitWhile((GramaticaCParser.WhileContext) ctx.whileLoop());
        return 0;
    }

    @Override
    public Object visitWhile(GramaticaCParser.WhileContext ctx) {
        Boolean condicao = (Boolean) visitBoolExpr(ctx.boolExpr());
        while (condicao) {
            visitBlock(ctx.block());
            condicao = (Boolean) visitBoolExpr(ctx.boolExpr());
        }
        return 0;
    }

    @Override
    public Object visitLineForLoop(GramaticaCParser.LineForLoopContext ctx) {
        return visitForLoop(ctx.forLoop());
    }

    @Override
    public Object visitForLoop(GramaticaCParser.ForLoopContext ctx) {
        visitAtr(ctx.atr(0));
        Boolean condicao = (Boolean) visitBoolExpr(ctx.boolExpr());
        for (; condicao; visitAtr(ctx.atr(1))) {
            visitBlock(ctx.block());
            condicao = (Boolean) visitBoolExpr(ctx.boolExpr());
        }
        return 0;
    }
}
