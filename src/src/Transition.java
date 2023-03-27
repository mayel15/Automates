// Pape THIAM
package src;
public class Transition {
    protected String etatI;
    protected String symbole;
    protected String etatF;


    public Transition(String etatI, String symbole, String etatF) {
        this.etatI = etatI;
        this.symbole = symbole;
        this.etatF = etatF;

    }

    public String getEtatI() {
        return etatI;
    }

    public void setEtatI(String etatI) {
        this.etatI = etatI;
    }

    public String getEtatF() {
        return etatF;
    }

    public void setEtatF(String etatF) {
        this.etatF = etatF;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    public String toString(){
        return etatI + " " +symbole + " " + etatF ;
    }
}
