package akshay.com;

public class main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger hb=new HealthyBurger("Pork",10.50);
        hb.HealthyAddition1("Sauce",15.05);
        hb.addHamburgerAddition1("Capsicum",20.05);
        System.out.println("Two Classes Final Price "+hb.itemizeHamburger());

        DeluxBurger db=new DeluxBurger();
        db.itemizeHamburger();
        System.out.println("ALl Three Classes Sum Price "+db.itemizeHamburger());
    }
}