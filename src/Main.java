import AContextual.AContextual;
import generated.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MiScanner inst = null;
        CharStream input=null;
        CommonTokenStream tokens = null;
        ParseTree tree=null;

        try {

            input = CharStreams.fromFileName("test.txt");
            inst = new generated.MiScanner(input);
            tokens = new CommonTokenStream(inst);
            MiParser p = new MiParser(tokens);

            tree = p.program();
            System.out.println("Compilación Terminada");
            //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, p);
            //treeGUI.get().setVisible(true);
            /*main.MiVisitor mv = new main.MiVisitor();
            mv.visit(tree);*/

            AContextual mv = new AContextual();
            mv.visit(tree);
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}

/*        List<Token> lista = (List<Token>) inst.getAllTokens();

        for (Token t : lista)
            System.out.println(inst.ruleNames[t.getType()-1] + ":" + t.getText() + "\n");*/

        // inst = new Scanner(input);
        // inst.reset();
    }
}
