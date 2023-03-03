package src;
public class Transition {
    protected int etatI;
    protected String symbole;
    protected int etatF;


    public Transition(Integer etatI, String symbole,Integer etatF) {
        this.etatI = etatI;
        this.symbole = symbole;
        this.etatF = etatF;

    }

    public int getEtatI() {
        return etatI;
    }

    public void setEtatI(Integer etatI) {
        this.etatI = etatI;
    }

    public int getEtatF() {
        return etatF;
    }

    public void setEtatF(Integer etatF) {
        this.etatF = etatF;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }
}
