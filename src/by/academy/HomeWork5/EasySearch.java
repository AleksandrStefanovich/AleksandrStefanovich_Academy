package by.academy.HomeWork5;

public class EasySearch implements ISearchEngine {
    @Override
    public int search(String str, String wordToSearch) {
        String symbols = " ,\".-!?:;\'()\n";
        int counter = 0;
        int index;
        str = str.toLowerCase();

        while (str.contains(wordToSearch)) {
            index = str.indexOf(wordToSearch);
            if (index == 0) {
                if (symbols.contains(str.charAt(index + wordToSearch.length()) + "")) {
                    counter++;
                }
            } else if (symbols.contains(str.charAt(index - 1) + "") &&
                    symbols.contains(str.charAt(index + wordToSearch.length()) + "")) {
                counter++;
            }
            if(wordToSearch == "и"&& str.charAt(index + wordToSearch.length()) == 'и'){
                str = str.substring(index + wordToSearch.length() + 1);
            } else {str = str.substring(index + wordToSearch.length());}

        }


        return counter;
    }
}
