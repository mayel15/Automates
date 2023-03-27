// Pape THIAM
package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Automate {
    protected Alphabet alphabet;
    protected ArrayList<String> etats;
    protected String etatI;
    protected ArrayList<String> etatF;
    protected ArrayList<Transition> transitions;


    public Automate(Alphabet alphabet, ArrayList<String> etats, String etatI, ArrayList<String> etatF, ArrayList<Transition> transitions) {
        this.alphabet = alphabet;
        this.etats = etats;
        this.etatI = etatI;
        this.etatF = etatF;
        this.transitions = transitions;

    }

    public String getEtatI() {
        return etatI;
    }

    public void setEtatI(String etatI) {
        this.etatI = etatI;
    }

    public Alphabet getAlphabet() {
        return alphabet;
    }

    public ArrayList<String> getEtats() {
        return etats;
    }

    public void setAlphabet(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public void setEtats(ArrayList<String> etats) {
        this.etats = etats;
    }

    public ArrayList<String> getEtatF() {
        return etatF;
    }

    public void setEtatF(ArrayList<String> etatF) {
        this.etatF = etatF;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    public boolean appartient(String mot) {
        // Initialisation de l'état courant avec l'état initial de l'automate
        String etatCourant = etatI;

        // Parcours du mot avec chaque caractère
        for (int i = 0; i < mot.length(); i++) {
            String symboleLu = Character.toString(mot.charAt(i));

            // Vérification que le symbole lu appartient à l'alphabet de l'automate
            if (!alphabet.getSymboles().contains(symboleLu)) {
                System.out.println("La sequence d'actions n'a pas été acceptée.");
                System.out.println("Le symbole " + symboleLu + " n'appartient pas à l'alphabet de l'automate.");
                return false;
            }

            // Recherche de la transition correspondant à l'état courant et au symbole lu
            Transition transition = null;
            for (Transition t : transitions) {
                if (t.getEtatI().equals(etatCourant) && t.getSymbole().equals(symboleLu)) {
                    transition = t;
                    break;
                }
            }

            // Vérification qu'une transition a bien été trouvée
            if (transition == null) {
                System.out.println("La sequence d'actions n'a pas été acceptée.");
                System.out.println("Il n'y a pas de transition à partir de l'état " + etatCourant + " avec le symbole " + symboleLu + ".");
                return false;
            }

            // Passage à l'état suivant
            etatCourant = transition.getEtatF();
        }

        // Vérification que l'état courant est bien un état final
        if (!etatF.contains(etatCourant)) {
            System.out.println("La sequence d'actions n'a pas été acceptée.");
            System.out.println("Le mot a été entièrement lu mais l'état courant (" + etatCourant + ") n'est pas un état final.");
            return false;
        }

        // Si on arrive ici, le mot a été reconnu
        System.out.println("La sequence d'actions a été acceptée.");
        return true;
    }

    public Automate(String nomDeFichier) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nomDeFichier));
        String line;
        ArrayList<String> alphabetSymboles = new ArrayList<>();
        ArrayList<String> etats = new ArrayList<>();
        String etatInitial = "";
        ArrayList<String> etatsFinaux = new ArrayList<>();
        ArrayList<Transition> transitions = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            if (line.equals("# alphabet")) {
                while (!(line = br.readLine()).startsWith("#")) {
                    alphabetSymboles.add(line);
                }
            }
            if (line.equals("# etats")) {
                while (!(line = br.readLine()).startsWith("#")) {
                    etats.add(line);
                }
            }
            if (line.equals("# etat initial")) {
                etatInitial = br.readLine();
            }
            if (line.equals("# etats finaux")) {
                while (!(line = br.readLine()).startsWith("#")) {
                    etatsFinaux.add(line);
                }
            }
            if (line.equals("# transitions")) {
                while ((line = br.readLine()) != null && !line.startsWith("#")) {
                    String[] transitionData = line.split(" ");
                    Transition transition = new Transition(transitionData[0], transitionData[1], transitionData[2]);
                    transitions.add(transition);
                }
            }
        }

        Alphabet alphabet = new Alphabet(alphabetSymboles);
        this.alphabet = alphabet;
        this.etats = etats;
        this.etatI = etatInitial;
        this.etatF = etatsFinaux;
        this.transitions = transitions;

        br.close();
    }


}
