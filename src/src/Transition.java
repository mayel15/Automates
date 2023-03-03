package src;
public class Transition {
    protected int etatI;
    protected int etatF;
    protected int symbole;

    public Transition(int etatI, int etatF, int symbole) {
        this.etatI = etatI;
        this.etatF = etatF;
        this.symbole = symbole;
    }

    public int getEtatI() {
        return etatI;
    }

    public void setEtatI(int etatI) {
        this.etatI = etatI;
    }

    public int getEtatF() {
        return etatF;
    }

    public void setEtatF(int etatF) {
        this.etatF = etatF;
    }

    public int getSymbole() {
        return symbole;
    }

    public void setSymbole(int symbole) {
        this.symbole = symbole;
    }
}
