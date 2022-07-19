
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Plansza extends Words {

    public Integer[] wylosujSłowa() {

        boolean wylosowanoWszystkieliczby = false;
        Random rand = new Random();
        Set<Integer> randomNumbers = new TreeSet<>();
        Integer[] arrayRandomNumbers = new Integer[4];
        do {
            randomNumbers.add(rand.nextInt(100));
        } while (randomNumbers.size() != 4);
        arrayRandomNumbers = randomNumbers.toArray(randomNumbers.toArray(new Integer[randomNumbers.size()]));
        for (int i = 0; i < 4; i++) {
            System.out.println(arrayRandomNumbers[i]);
        }
        return arrayRandomNumbers;
    }

    public String[] tablicaSłów(Integer[] tablicaLosowychLiczb, String[] tablicaPobranychSłów) {

        String[] arrayOfWords = new String[4];
        for (int i = 0; i < 4; i++) {
            arrayOfWords[i] = tablicaPobranychSłów[tablicaLosowychLiczb[i]];
            System.out.println(arrayOfWords[i]);
        }
        return arrayOfWords;
    }


}
