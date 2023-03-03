package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println("Hello world!");
        // read a file
        InputStream ins = new FileInputStream("C:\\fichiers\test.txt");
        Scanner obj = new Scanner(ins);
        while(obj.hasNextLine()) System.out.println(obj.nextLine());

        //test
        ArrayList<String> symb = null;
        symb.add("a");
        symb.add("b");
        Alphabet alphabet = new Alphabet(symb);

        ArrayList<Integer> etats = null;
        etats.add(1); etats.add(2); etats.add(3);
        Integer etatI = etats.get(0);
        ArrayList<Integer> etatF = null;
        etatF.add(etats.get(2));

        ArrayList<Transition> transitions = null;
        Transition t1 = new Transition(1, "a",1);
        transitions.add(t1);
        Transition t2 = new Transition(1, "b",2);
        transitions.add(t2);
        Transition t3 = new Transition(2, "b",2);
        transitions.add(t3);
        Transition t4 = new Transition(2, "a",3);
        transitions.add(t4);

        Automate automate = new Automate(alphabet, etats, etatI, etatF, transitions);

        System.out.println(automate.appartient("a"));
    }
}