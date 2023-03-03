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
        Alphabet alphabet = new Alphabet(list);

        ArrayList<Integer> etats = null;
        etats.add(1); etats.add(2); etats.add(3);
        Automate automate = new Automate(alphabet, etats, etatI, etatF, transitions);


    }
}