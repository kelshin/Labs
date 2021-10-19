package Labs.Lab2;

import Labs.Lab2.Province.*;
import java.util.Arrays;

public class Canada{
    private Province[] provinces = new Province[10];

    public Canada(){
        this.provinces[0] = new Province("Alberta","Edmonton",4067175);
        this.provinces[1] = new Province("British Columbia","Victoria",4648055);
        this.provinces[2] = new Province("Northwest Territories","Yellowknife",41786);
        this.provinces[3] = new Province("Nova Scotia","Halifax",923598);
        this.provinces[4] = new Province("Nunavut","Charlottetown",35944);
        this.provinces[5] = new Province("Ontario","Toronto",13448494);
        this.provinces[6] = new Province("Prince Edward Island","Charlottetown",142907);
        this.provinces[7] = new Province("Quebec","Quebec City",8164361);
        this.provinces[8] = new Province("Saskatchewan","Regina",1098352);
        this.provinces[9] = new Province("Manitoba","Winnipeg",1278365);
    }

    public void displayAllProvinces(){
        for(Province province : provinces) {
            province.getDetails();
        }
    }

    public int getNumOfProvincesBetween(int min, int max){
        int countProvinces = 0;
        for(Province province : provinces){
            if (province.getPopulation() > (min * 1000000L) && province.getPopulation() < (max  * 1000000L)){
                countProvinces++;
            }
        }
        return countProvinces;
    }
}
