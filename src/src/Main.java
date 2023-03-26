package src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");
        // read a file
        /*InputStream ins = new FileInputStream("C:\\fichiers\automate1.txt");
        Scanner obj = new Scanner(ins);
        while(obj.hasNextLine()) System.out.println(obj.nextLine());*/

        //test
        /*ArrayList<String> symb = new ArrayList<>();
        symb.add("a");
        symb.add("b");
        Alphabet alphabet = new Alphabet(symb);

        ArrayList<String> etats = new ArrayList<>();
        etats.add("S1"); etats.add("S2"); etats.add("S3");
        String etatI = etats.get(0);
        ArrayList<String> etatF = new ArrayList<>();
        etatF.add(etats.get(2));

        ArrayList<Transition> transitions = new ArrayList<>();
        Transition t1 = new Transition("S1", "a","S1");
        transitions.add(t1);
        Transition t2 = new Transition("S1", "b","S2");
        transitions.add(t2);
        Transition t3 = new Transition("S2", "b","S2");
        transitions.add(t3);
        Transition t4 = new Transition("S2", "a","S3");
        transitions.add(t4);*/

        Automate automate = null;
        try {
            automate = new Automate("src/files/automate2.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String nomDeFichier = "src/files/testAutomate2.txt";
        BufferedReader br = new BufferedReader(new FileReader(nomDeFichier));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("# mots")) {
                while (!(line = br.readLine()).startsWith("#")) {
                    //alphabetSymboles.add(line);
                    System.out.println(line + " "  + automate.appartient(line));
                }
            }
        }
        /*String[] mots = {"21Ss", "5Svs", "L22L1Ll", "2Ss", "5S5s", "d51l", "2115dvdSvs" };
        //String[] mots = {"ab", "abba", "bba", "aba", "abbbba", "aaabbbba"};
        for(String mot : mots){
            System.out.println(mot + " "  + automate.appartient(mot));
        }*/

        //System.out.println(automate.appartient("ab"));


    }
}