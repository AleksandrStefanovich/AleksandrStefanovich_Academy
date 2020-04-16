package by.academy.HomeWork5;

public class EasySearchV2 implements ISearchEngine {
    @Override
    public int search(String str, String wordToSearch) {
        String symbols = "[^a-zа-яё ]";
        int counter = 0;
        int index = 0;
        str = str.toLowerCase().replaceAll(symbols, " ");

        while ((str.indexOf(wordToSearch, index)) != -1) {
            index = str.indexOf(wordToSearch, index);
            if (index == 0) {
                if (' ' == str.charAt(index + wordToSearch.length())) {
                    counter++;
                }
            } else if (' ' == str.charAt(index - 1) &&
                    ' ' == str.charAt(index + wordToSearch.length())) {
                counter++;
            }
            if(wordToSearch == "и"&& str.charAt(index + wordToSearch.length()) == 'и'){
                index = index + wordToSearch.length() + 1;
            } else {index = index + wordToSearch.length();}

        }


        return counter;
    }
}
