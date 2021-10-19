package Labs.Lab2;


public class Driver {
    public static void main(String[] args) {
        Province p1 = new Province();
        p1.getDetails();

        Province p2 = new Province("Nova Scotia","Edmonton",10000000);
        p2.getDetails();

        Canada canada = new Canada();
        canada.displayAllProvinces();
        System.out.println(canada.getNumOfProvincesBetween(1,15) + " number(s) of province(s) found");
    }
}
