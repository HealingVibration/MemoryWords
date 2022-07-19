import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Words{

    String[] wordsArray = new String[100];

    public Words(String... wordsArray){
        this.wordsArray = wordsArray;
    }



    public String[] letsBufferFileReader() throws IOException {
        FileReader fileReader = new FileReader("src/Words.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String word;

        for (int i =0; i <100; i++) {
            word = bufferedReader.readLine();
            wordsArray[i] = word;
        }
        return wordsArray;
    }

}
