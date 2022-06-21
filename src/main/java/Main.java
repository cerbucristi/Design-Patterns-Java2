import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Load Default List");
        System.out.println("2. Show List");
        System.out.println("3. Remove item at index");
        System.out.println("0. Exit");

        WordListPrototype wordListPrototype = new WordListPrototype();
        List<String> wordList = new ArrayList<>();
        while (true){
            Scanner keyboard = new Scanner(System.in);
            int option = keyboard.nextInt();
            switch (option){
                case 0:
                    return;
                case 1:
                    System.out.println("List Loaded successfully");
                    wordList = wordListPrototype.clone().getWordList();
                    break;
                case 2:
                    wordList.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Insert index to be removed:");
                    option = keyboard.nextInt();
                    try{
                        wordList.remove(wordList.get(option));
                    }catch (IndexOutOfBoundsException e ){
                        System.out.println("Index out of Bound");
                    }
            }
        }



    }
}
