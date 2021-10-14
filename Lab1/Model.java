/**
 * Intro to OOP lab assignment
 * Model class
 *
 *
 * @author Kelbin Mark David
 */
package Labs.Lab1;
import static Labs.Lab1.Source.*;

public class Model {
    private String fname;
    private String lname;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     * return nothing for empty parameter constructor
     * @param
     */
    public Model(){
    }

    /**
     * Constructor for Model with complete parameter given
     * @param fname First name of Model
     * @param lname Last name of model
     * @param height Height given in inches
     * @param weight Weight given in pounds
     * @param canTravel true or false
     * @param smokes true or false
     */
    public Model(String fname, String lname, int height, long weight, boolean canTravel, boolean smokes){
        setFname(fname);
        setLname(lname);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * Constructor with default canTravel to true and Smokes to false
     * @param fname First name of Model
     * @param lname Last name of model
     * @param height Height given in inches
     * @param weight Weight given in pounds
     */
    public Model(String fname, String lname, int height, double weight){
        setFname(fname);
        setLname(lname);
        setHeight(height / INCHES_PER_FOOT, height / INCHES_PER_FOOT);
        setWeight(weight);
        setCanTravel(true);
        setSmokes(false);
    }

    /**
     *
     * @return First name of Model
     */
    public String getFname() {
        return fname;
    }

    /**
     *
     * @return Last name of Model
     */
    public String getLname() {
        return lname;
    }

    /**
     *
     * @return Height of Model in inches
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return Weight of Model in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param fname Stores first name if length is with in 3 to 20 characters
     */
    public void setFname(String fname) {
        if (fname.length() < 3 || fname.length() > 20){
            throw new IllegalArgumentException("Error first name is too short or too long");
        } else {
            this.fname = fname;
        }
    }

    /**
     *
     * @param lname Stores last name if length is with in 3 to 20 characters
     */
    public void setLname(String lname) {
        if (lname.length() < 3 || lname.length() > 20){
            throw new IllegalArgumentException("Error last name is too short or too long");
        } else {
            this.lname = lname;
        }
    }

    /**
     *
     * @param height Stores height if higher or equal to 24 and lower or equal to 84 inches
     */
    public void setHeight(int height) {
        if(height < 24 || height > 84){
            throw new IllegalArgumentException("Error height must be from range 24 to 84 inches");
        } else {
            this.height = height;
        }
    }

    /**
     *
     * @param feet Height in feet
     * @param inches plus inches to height
     */
    public void setHeight(int feet, int inches){
        double totalHeight = (feet * 12) + inches;
        if(totalHeight < 24 || totalHeight > 84){
            throw new IllegalArgumentException("Error height must be from range 24 to 84 inches");
        } else {
            this.height = (int)totalHeight;
        }
    }

    /**
     *
     * @param weight Stores weight if higher or equal to 80 and lower or equal to 280 pounds
     */
    public void setWeight(double weight) {
        if(weight >= 80 || weight <= 280){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("weight must be from range 80 to 280 pounds");
        }
    }

    /**
     *
     * @param weight Stores weight if higher or equal to 80 and lower or equal to 280 pounds
     */
    public void setWeight(long weight) {
        if(weight >= 80 || weight <= 280){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("weight must be from range 80 to 280 pounds");
        }
    }

    /**
     *
     * @param canTravel Stores if Model can travel or not
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     *
     * @param smokes Stores if Model smokes or not
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     *
     * @return converted height in inches of model to Feet and Inches
     */
    public String getHeightInFeetAndInches(){
        // inches = foot : 12 = 1
        int totalFeet = getHeight() / INCHES_PER_FOOT;
        int remainingInches = getHeight() % INCHES_PER_FOOT;
        return String.format("%s and %s",
                (totalFeet > 1) ? totalFeet + " feet": totalFeet + " foot" ,
                (remainingInches > 1) ? remainingInches + " inches": remainingInches + " inch");
    }

    /**
     *
     * @return converted weight in pounds to kg
     */
    public long getWeightKg(){
        return Math.round(getWeight() / POUNDS_PER_KG);
    }

    /**
     *
     * @return total hourly rate of Model
     */
    public int calculatePayDollarsPerHour(){
        int sum = BASE_RATE_DOLLARS_PER_HOUR;
        sum += (getHeight() > TALL_INCHES && getWeight() < THIN_POUNDS) ? TALL_THIN_BONUS_DOLLARS_PER_HOUR : 0;
        sum += (canTravel) ? TRAVEL_BONUS_DOLLARS_PER_HOUR : 0;
        sum += (smokes) ? SMOKER_DEDUCTION_DOLLARS_PER_HOUR : 0;
        return sum;
    }

    /**
     * Print details of the Model with Hourly rate
     */
    public void printDetails() {
        System.out.println("Name: " + getFname() + " " + getLname());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeightKg() * POUNDS_PER_KG) + " pounds");
        if(canTravel == true){
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }
        if(smokes == true){
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
        System.out.println();
    }

    /**
     * Print details of model with height converted to Feet and Inches
     */
    public void displayModelDetails(){
        System.out.println("Name: " + getFname() + " " + getLname());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        if(canTravel == true){
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }
        if(smokes == true){
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
        System.out.println();
    }

}
