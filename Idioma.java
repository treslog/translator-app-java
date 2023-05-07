import java.util.ArrayList;
import java.util.List;

public class Idioma {
    private String name = "";
    private List<String> words = new ArrayList<>();

    public Idioma(String name) {
        this.name = name;
    }

    public void addWord(String word, int index) {
        try {
            words.add(index, word);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public int getWordIndex(String word) {
        try {
            return words.indexOf(word);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    public String getWord(int index) {
        try {
            return words.get(index);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "";
        }
    }
}