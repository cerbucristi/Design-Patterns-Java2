import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * I used Singleton and Prototype
 */
public class WordLoader {

    final String fileName = "WordList.txt";

    List<String> wordList = new ArrayList<>();

    static WordLoader instance = null;

    public WordLoader() {
        BufferedReader reader;
        try {
            InputStream resource = Main.class.getClassLoader().getResourceAsStream(fileName);
            assert resource != null;
            reader = new BufferedReader(new InputStreamReader(resource));
            String line = reader.readLine();
            while (line != null) {
                wordList.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static WordLoader getInstance (){
        if (instance == null){
            instance = new WordLoader();
        }
        return instance;
    }

    public List<String> getWordList() {
        return wordList;
    }
}
