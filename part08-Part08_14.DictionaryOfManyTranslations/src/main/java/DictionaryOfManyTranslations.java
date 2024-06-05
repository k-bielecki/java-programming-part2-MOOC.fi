import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add (String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate (String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove (String word) {
        dictionary.remove(word);
    }
}