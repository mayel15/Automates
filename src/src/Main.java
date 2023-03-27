// Pape THIAM
package src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
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
                while (/*(line = br.readLine()) != null &&*/ !(line = br.readLine()).startsWith("#")) {
                    System.out.println(line + " "  + automate.appartient(line) + "\n");
                }
            }
        }
    }
}