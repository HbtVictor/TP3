package StatePattern;

/**
 * Interface représentant un état du lecteur audio.
 * Toutes les actions possibles (play, pause, stop) sont déclarées ici.
 * Chaque état concret implémentera ces méthodes différemment.
 */
public interface Etat {
    void play(LecteurAudio lecteur);
    void pause(LecteurAudio lecteur);
    void stop(LecteurAudio lecteur);
}
