package StatePattern;

public class LectureState implements Etat {

    @Override
    public void play(LecteurAudio lecteur) {
        System.out.println("▶ La lecture est déjà en cours.");
    }

    @Override
    public void pause(LecteurAudio lecteur) {
        System.out.println("⏸ Mise en pause...");
        lecteur.setEtat(new PauseState());
        System.out.println("État actuel : PAUSE");
    }

    @Override
    public void stop(LecteurAudio lecteur) {
        System.out.println("⏹ Arrêt de la lecture...");
        lecteur.setEtat(new StopState());
        System.out.println("État actuel : STOP");
    }
}
