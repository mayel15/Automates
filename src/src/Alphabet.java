// Pape THIAM
package src;

import java.util.ArrayList;

public class Alphabet {
    protected ArrayList<String> symboles;

    public Alphabet(ArrayList<String> symboles) {
        this.symboles = symboles;
    }

    public ArrayList<String> getSymboles() {
        return symboles;
    }

    public void setSymboles(ArrayList<String> symboles) {
        this.symboles = symboles;
    }
}
