package Labs.Lab2;

import java.util.Arrays;

import static Labs.Lab2.StaticDetails.*;

public class Province {
    private String province;
    private String capital;
    private long population;

    /**
     * Empty parameter
     */
    public Province(){
        setProvince("British Columbia");
        setCapital("Victoria");
        setPopulation(4648055);
    }

    public Province(String province, String capital, long population){
        if(isValidPopulation(population) && isValidProvince(province) && isValidCapital(capital)){
            setProvince(province);
            setCapital(capital);
            setPopulation(population);
        } else {
            setProvince(DEFAULT_PROVINCE);
            setCapital(DEFAULT_CAPITAL);
            setPopulation(DEFAULT_POPULATION);
        }
    }

    public String getProvince() {
        return province;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    private boolean isValidPopulation(long population) {
        return population >= MIN_POPULATION && population <= MAX_POPULATION;
    }

    private boolean isValidProvince(String province){
        String[] listOfProvinces = {"Alberta","British Columbia","Manitoba","New Brunswick","Newfoundland & Labrador",
                "Northwest Territories","Nova Scotia","Nunavut","Ontario","Prince Edward Island","Quebec"
                ,"Saskatchewan","Yukon","Manitoba"};
        return Arrays.asList(listOfProvinces).contains(province);
    }

    private boolean isValidCapital(String capital){
        String[] listOfCapitals = {"Ottawa","Edmonton","Victoria","Winnipeg","Fredericton","St. John's","Halifax","Toronto"
                ,"Charlottetown","Quebec City","Regina","Yellowknife","Iqaluit","Whitehorse","Winnipeg"};
        return Arrays.asList(listOfCapitals).contains(capital);
    }

    public void getDetails(){
        System.out.printf("The capital of %s (population. %d) is %s",getProvince(),getPopulation(),getCapital());
        System.out.println();
    }
}
