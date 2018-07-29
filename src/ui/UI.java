package ui;

import core.Blackboard;
import core.Controller;
import core.enums.KnowledgeSources;
import core.enums.UpdateType;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws java.io.IOException {
        int option;
        Controller controller = new Controller(new Blackboard());
        boolean exit;

        do {
            showMenu();
            option = readOption();
            exit = execAction(option,controller);
        } while (!exit);
    }

    static void showMenu(){
        out.println();
        out.println("Menu");
        out.println();
        out.println("1.  Imprimir solucion de pizarra.");
        out.println("2.  Remplazar solucion de pizarra.");
        out.println("3.  Actualizar solucion de pizarra.");
        out.println("0.  Exit.");
        out.println();
    }

    static int readOption() throws java.io.IOException {
        int option;
        out.print("Seleccione su opcion: ");
        option= Integer.parseInt(in.readLine());
        out.println();
        return option;
    }

    static boolean execAction(int poption,Controller controller){
        boolean exit = false;

        switch (poption) {
            case 0: // Exits the app.
                exit = true;
                break;
            case 1: //
                out.println(controller.getSolution());
                break;
            case 2: //
                controller.executeKS(UpdateType.REPLACE,KnowledgeSources.FIRST);
                break;
            case 3: //
                controller.executeKS(UpdateType.ADD,KnowledgeSources.FIRST);
                break;
            default: // Any value that isn't in the options
                out.println("Opcion invalida.");
                out.println();
                break;
        }
        return exit;
    }
}
