import java.util.ArrayList;
import java.util.List;

public class WordListPrototype{

    private final List<String> wordList;

    public WordListPrototype(List<String> wordList) {
        this.wordList = wordList;
    }

    public WordListPrototype(){
        wordList = WordLoader.getInstance().getWordList();
    }

    public List<String> getWordList() {
        return wordList;
    }

    public WordListPrototype clone(){
        List<String> temp = new ArrayList<String>();
        for(String s : this.getWordList()){
            temp.add(s);
        }
        return new WordListPrototype(temp);
    }
}
