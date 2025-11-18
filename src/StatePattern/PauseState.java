package StatePattern;

public class PauseState implements Etat {

    @Override
    public void play(LecteurAudio lecteur) {
        System.out.println("▶ Reprise de la lecture...");
        lecteur.setEtat(new LectureState());
        System.out.println("État actuel : LECTURE");
    }

    @Override
    public void pause(LecteurAudio lecteur) {
        System.out.println("⏸ Le lecteur est déjà en pause.");
    }

    @Override
    public void stop(LecteurAudio lecteur) {
        System.out.println("⏹ Arrêt depuis la pause...");
        lecteur.setEtat(new StopState());
        System.out.println("État actuel : STOP");
    }
}