import java.io.*;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class MemoryWords {


    public static void main(String[] args) throws IOException {
        String firstWord;
        String[] arrayWords = new String[100];
        Words words = new Words(arrayWords);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        Plansza plansza = new Plansza();
        String level;
        int chance = 10;
        boolean correct = false;
        String[] arrayOfWordsToGuess;
        plansza.wylosujSłowa();
        arrayOfWordsToGuess = plansza.tablicaSłów(plansza.wylosujSłowa(), words.letsBufferFileReader());
        int points = 0;
        System.out.println("choose your level 'easy' or 'hard'");
        do {
            level = scanner.nextLine();
        } while (!level.equals("hard") && !level.equals("easy"));




        switch (level) {
            case "easy":
                System.out.println("lvl easy");
                do {
                    System.out.println("write your answer");
                    String correctAnswer = scanner.nextLine();
                    for (int i = 0; i < 4; i++) {
                        if (correctAnswer.equals(arrayOfWordsToGuess[i])) {
                            correct = true;
                        }

                    }
                    if (correct == true) {
                        points++;
                    } else {
                        chance--;
                    }
                    correct = false;
                    System.out.println("You got " + points + " points and " + chance + "chances");
                } while (points < 4 && chance > 0 );
                break;
            case "hard":
                System.out.println("lvl hard");
                break;
        }


//        for(int i=0; i<100; i++)
//        if(words.letsBufferFileReader()[i].equals(correctAnswer)) {
//            System.out.println("trafiłeś");
//        }
//        for (int i = 0; i<100; i++) {
//            System.out.println(words.letsBufferFileReader()[i]);
//        }
    }
}
