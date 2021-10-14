package Labs.Lab1;

public class Driver {
    public static void main(String[] args) {

        Model m1 = new Model();
        m1.printDetails();

        Model m2 = new Model("Tiger","Woods",72,190,true,true);
        m2.printDetails();

        Model m3 = new Model("Tiger","Woods",72,190,true,true);
        m3.displayModelDetails();

        Model m4 = new Model("Susan","Smith",82,190);
        m4.printDetails();

        Model m5 = new Model("Susan","Smith",82,190);
        m5.displayModelDetails();
    }
}
