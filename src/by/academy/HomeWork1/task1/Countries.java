package by.academy.HomeWork1.task1;

public enum Countries implements IGetterOfCountryInfo
                        { BELARUS(207600,9468000), RUSSIA(17075200,143300000),
                        POLAND(312685,38167000), USA(9629091,310241000),
                        FRANCE(547030,65447000), GREECE(131940,11306000),
                        GERMANY(357021,81802000), ITALY(301230,60402000),
                        CHINA(9596960,1339450000), MADAGASKAR(587040,20146000);
    private int area;
    private int numberOfCitizens;

    Countries(int area, int numberOfCitizens) {
        this.area = area;
        this.numberOfCitizens = numberOfCitizens;
    }

    public int getArea() {
        return area;
    }

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }
}
