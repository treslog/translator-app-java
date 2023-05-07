import java.util.ArrayList;
import java.util.List;

public class Traductor {
    private List<Idioma> idiomas = new ArrayList<>();

    public void addIdioma(Idioma idioma) {
        try {
            idiomas.add(idioma);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<String> getIdiomasNames() {
        List<String> names = new ArrayList<>();
        try {
            for (Idioma idioma : idiomas) {
                names.add(idioma.getName());
            }
            return names;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    private Idioma getIdioma(String name) {
        try {
            for (Idioma idioma : idiomas) {
                if (idioma.getName().equals(name)) {
                    return idioma;
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public void addWord(String word, String idiomaName, int index) {
        try {
            getIdioma(idiomaName).addWord(word, index);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String translate(String from, String to, String text) {

        int index = getIdioma(from).getWordIndex(text);

        try {
            if (index == -1) {
                return null;
            }
            return getIdioma(to).getWord(index);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}