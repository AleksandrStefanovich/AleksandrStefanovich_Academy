package by.academy.HomeWork5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class EasySearchWithMap implements ISearchEngine {

    Map<String, Integer> words = new HashMap<>();
    Map<String, Integer> sortedWords = new HashMap<>();

    public EasySearchWithMap(String str) {
        addWordsToMap(str);
    }

    @Override
    public int search(String str, String wordToSearch) {
        return this.words.get(wordToSearch);
    }

    private void addWordsToMap(String str) {
        String unneeded = "[^a-zа-яё ]";
        str = str.toLowerCase().replaceAll(unneeded, " ");
        String[] word = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (!(word[i].isEmpty())) {
                if (this.words.containsKey(word[i])) {
                    this.words.put(word[i], this.words.get(word[i]) + 1);
                } else {
                    this.words.put(word[i], 1);
                }
            }
        }
    }

    public int getNumberOfWords(){
        return this.words.size();
    }

    public void sort(){
        this.sortedWords = this.words.entrySet().stream().sorted(comparingByValue())
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                LinkedHashMap::new));
    }

    public Map<String, Integer> getWords() {
        return words;
    }

    public Map<String, Integer> getSortedWords() {
        return sortedWords;
    }
}


