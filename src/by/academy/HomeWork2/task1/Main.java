package by.academy.HomeWork2.task1;

public class Main {
    public static void main(String[] args) {

        Countries countryInfo = Countries.GERMANY;
        System.out.println(countryInfo);
        Countries countryFromString = Countries.valueOf("GERMANY");
        System.out.println(countryFromString == countryInfo);
        //Countries notCountryFromString = Countries.valueOf("NEVERLAND");
        // Exception in thread "main" java.lang.Illegal
        // ArgumentException: No enum constant by.academy.HomeWork1.task1.Countries.NEVERLAND
        Countries countryInfo1 = Countries.FRANCE;
        Countries countryInfo2 = Countries.BELARUS;
        System.out.println(countryInfo.compareTo(countryFromString));
        System.out.println(countryInfo1.compareTo(countryInfo2));   //метод берёт ordinal-ы элемента
                                                                    // и отнимает от первого второй
        CountryAreaComparator compar = new CountryAreaComparator();
        Countries countryComparator1 = Countries.RUSSIA;
        Countries countryComparator2 = Countries.ITALY;
        int areaComparsionOut = compar.compare(countryComparator1, countryComparator2);
        switch (areaComparsionOut){
            case 0:
                System.out.println(countryComparator1 + " и " + countryComparator2 + " имеют одинаковую площадь"); break;
            case 1:
                System.out.println("Площадь " + countryComparator1 +" больше площади " + countryComparator2); break;
            case -1:
                System.out.println("Площадь " + countryComparator2 + " больше площади " + countryComparator2); break;
        }
    }
}
