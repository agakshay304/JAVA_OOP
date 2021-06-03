package akshay.com;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("Deluxe", "Chicken", 100.05, "Bun");
        super.addHamburgerAddition1("Chips",35.05);
        super.addHamburgerAddition2("Kurkure",36.05);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't Add as it is delux");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't Add as it is delux");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't Add as it is delux");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't Add as it is delux");
    }
}
