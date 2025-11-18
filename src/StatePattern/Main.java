package StatePattern;

public class Main {
    public static void main(String[] args) {
        LecteurAudio lecteur = new LecteurAudio();

        System.out.println("\n--- Test des transitions d'état ---");

        lecteur.play();   // Stop → Lecture
        lecteur.play();   // Déjà en lecture
        lecteur.pause();  // Lecture → Pause
        lecteur.play();   // Pause → Lecture
        lecteur.stop();   // Lecture → Stop
        lecteur.pause();  // Impossible depuis Stop
        lecteur.stop();   // Déjà arrêté
        lecteur.play();   // Stop → Lecture
        lecteur.pause();  // Lecture → Pause
        lecteur.stop();   // Pause → Stop
    }
}
