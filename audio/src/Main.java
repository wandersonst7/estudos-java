import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);

        File file = new File("RUBIKA_Sunrise.wav");

        /*
            Você verá muito essa palavra “Stream” que é um fluxo de dados,
            seja para leitura ou para escrita.
         */
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = play, S = Stop, R = reset, Q = Quit");
            System.out.println("Faça sua escolha: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Digite uma resposta valida");
            }
        }

    }

}