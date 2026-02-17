import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AdjectiveStory {
    private final Scanner scanner;

    public AdjectiveStory (Scanner scanner) {
        this.scanner = scanner;

    }

    private void run() {
        System.out.println("This is an Adjective story, where the adjectives you insert will be added to a premade story.");
        System.out.println("Please tell me how many words you will like to insert (1-3 words)");
        int wordCount = scanner.nextInt();
        adjectives(wordCount);
    }

    private List<String> adjectives(int wordCount) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < wordCount; i++) {
            System.out.println("Insert an Adjective:");
            String word = scanner.nextLine().trim();
            words.add(word);
        }
        return words;
    }

    private String Story (List<String> wordsList) {
        String fullStory = "";
        for (String word : wordsList) {

        }
    }

}


