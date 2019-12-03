/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorc;

import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import compiladorc.parser.GramaticaCLexer;
import compiladorc.parser.GramaticaCParser;
import compiladorc.parser.GramaticaCVisitor;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author mayla
 */
public class CompiladorC {

    /**
     * @param args the command line arguments
     */
    /*private static ParseTree parser(CharStream input) throws RecognitionException{
        //CharStream input = new ANTLRFileStream("TesteMédia");
        GramaticaCLexer lexer = new GramaticaCLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        GramaticaCParser parser = new GramaticaCParser(tokens);
        parser.addParseListener(new CompiladorCListener());
        GramaticaCParser.ProgramaContext lang = parser.programa();
        showParseTreeFrame(lang,parser);
        return parser.programa();
    } */
    public static void main(String[] args) throws Exception {
        CharStream input = new ANTLRFileStream("text.txt");
        GramaticaCLexer lexer = new GramaticaCLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        GramaticaCParser parser = new GramaticaCParser(tokens);
        GramaticaCParser.ProgramaContext lang = parser.programa();
        parser.addParseListener(new MyGramaticaCListener());
        GramaticaCVisitor eval = new MyGramaticaCVisitor();
        //showParseTreeFrame(lang, parser);

        eval.visit(lang);
    


    }

    private static void showParseTreeFrame(ParseTree tree, GramaticaCParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
