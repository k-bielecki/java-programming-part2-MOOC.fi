package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;
    private Scanner scanner;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
    }
    public void delete (String word) {

        dictionary.remove(word);

        for (String i : dictionary.keySet()) {
            if (dictionary.get(i).equals(word)) {
                dictionary.remove(i);
                return;
            }
        }
    }

    public String translate(String word) {

        if (dictionary.containsKey(word)) {
            return dictionary.getOrDefault(word, null);
        } else {
            for (String i : dictionary.keySet()) {
                if (dictionary.get(i).equals(word)) {
                    return i;
                }
            }
        }
        return null;
    }

    public boolean load() {
        try {
            this.scanner = new Scanner(Paths.get(this.file));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");

                dictionary.putIfAbsent(parts[0],parts[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return true;
    }

    public boolean save() {
        try {
            PrintWriter printWriter = new PrintWriter(this.file);

            for (String i : dictionary.keySet()) {
                printWriter.println(i + ":" + dictionary.get(i));
            }
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
