package StatePattern;

public class LecteurAudio {

    // Attribut central du pattern State : l'état courant
    private Etat etatCourant;

    // On démarre toujours à l'état arrêté
    public LecteurAudio() {
        this.etatCourant = new StopState();
        System.out.println("Lecteur audio initialisé → État : STOP");
    }

    // Méthode pour changer dynamiquement d'état
    public void setEtat(Etat etat) {
        this.etatCourant = etat;
    }

    // Délégation des actions à l'état courant → comportement change automatiquement !
    public void play() {
        etatCourant.play(this);
    }

    public void pause() {
        etatCourant.pause(this);
    }

    public void stop() {
        etatCourant.stop(this);
    }

    // Pour afficher l'état actuel (utile pour debug)
    public Etat getEtatCourant() {
        return etatCourant;
    }
}
