package StatePattern;

public class StopState implements Etat {

    @Override
    public void play(LecteurAudio lecteur) {
        System.out.println("▶ Démarrage de la lecture...");
        lecteur.setEtat(new LectureState());
        System.out.println("État actuel : LECTURE");
    }

    @Override
    public void pause(LecteurAudio lecteur) {
        System.out.println("⚠ Impossible de mettre en pause : le lecteur est arrêté.");
    }

    @Override
    public void stop(LecteurAudio lecteur) {
        System.out.println("⏹ Le lecteur est déjà arrêté.");
    }
}
