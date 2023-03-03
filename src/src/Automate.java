package src;

import java.util.ArrayList;
import src.Transition;

import static java.lang.System.in;

public class Automate {
    protected Alphabet alphabet;
    protected ArrayList<Integer> etats;
    protected Integer etatI;
    protected ArrayList<Integer> etatF;
    protected ArrayList<Transition> transitions;


    public Automate(Alphabet alphabet, ArrayList<Integer> etats, Integer etatI, ArrayList<Integer> etatF, ArrayList<Transition> transitions) {
        this.alphabet = alphabet;
        this.etats = etats;
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

    public Alphabet getAlphabet() {
        return alphabet;
    }

    public ArrayList<Integer> getEtats() {
        return etats;
    }

    public void setAlphabet(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public void setEtats(ArrayList<Integer> etats) {
        this.etats = etats;
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


    public Integer checkTransition(Integer etati, String s,Integer etatf){
        for(int i=0; i<=transitions.size();i++){
            Transition trans = transitions.get(i);
            if (trans.getEtatI() == etati && trans.getSymbole() == s && trans.getEtatF() == etatf) {
                return etatf;
            }
        }
        return etati;
    }

    public boolean appartient(String mot){
        //checkTransition((etatI, s, etat))
        Integer checkEtatF = null;
        Integer checkEtatI = etatI;
        //Integer checkEtatI = etatI;
        for(int i=0; i<mot.length();i++){
            for (int j=0;j<= etats.size();j++){
                checkEtatF = checkTransition(checkEtatI, String.valueOf(mot.charAt(i)), etats.get(j));
                checkEtatI = checkEtatF;
            }
            if (i == mot.length()-1){
                for(int k=0;k<etatF.size(); k++ ){
                    if(checkEtatF == etatF.get(k)) return true;
                }
            }
        }
        return false ;
    }

    //public Automate(String nomFichier){
    //    return;
    //}
}
