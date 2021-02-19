public class Ordine {

    public enum Stato {
        RICEVUTO, IN_ELABORAZIONE, EVASO
    }

    private Piatto piatto;
    private Tavolo tavolo;
    private Camerieri camerieri;
    private Stato stato;

    public Ordine(Piatto piatto, Tavolo tavolo, Camerieri camerieri) {
        this.piatto = piatto;
        this.tavolo = tavolo;
        this.camerieri = camerieri;
        this.stato = Stato.RICEVUTO;
    }

    public Piatto getPiatto() {
        return piatto;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public Camerieri getCamerieri() {
        return camerieri;
    }

    public Stato getStato() {
        return stato;
    }

    @Override
    public String toString() {
        return piatto +
                ", " + tavolo +
                ", " + stato;
    }
}
