package src;

import java.util.ArrayList;
import src.Transition;

public class Automate {
    Integer etatI;
    ArrayList<Integer> etatF;
    ArrayList<Transition> transitions;

    public Automate(Integer etatI, ArrayList<Integer> etatF, ArrayList<Transition> transitions) {
        this.etatI = etatI;
        this.etatF = etatF;
        this.transitions = transitions;
    }

    public Integer getEtatI() {
        return etatI;
    }

    public void setEtatI(Integer etatI) {
        this.etatI = etatI;
    }

    public ArrayList<Integer> getEtatF() {
        return etatF;
    }

    public void setEtatF(ArrayList<Integer> etatF) {
        this.etatF = etatF;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    public Automate(String nomFichier){
        return;
    }


    public boolean appartient(String mot){
        // retourne si le mot est reconnu par l'automate et non
        //if( return true;
        //else return false;
        return true ;
    }
}
