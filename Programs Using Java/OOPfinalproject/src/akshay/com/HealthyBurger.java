package akshay.com;

public class HealthyBurger extends Hamburger {
    private String HealthyExtra1Name;
    private  double HealthyExtra1Price;

    private String HealthyExtra2Name;
    private  double HealthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "Brown Rye");
    }

    public void HealthyAddition1(String name,double price)
    {
        this.HealthyExtra1Name=name;
        this.HealthyExtra1Price=price;
    }

    public void HealthyAddition2(String name,double price)
    {
        this.HealthyExtra2Name=name;
        this.HealthyExtra2Price=price;
    }

    @Override
    public double itemizeHamburger() {
        double Hamburgerprice=super.itemizeHamburger();
        if(this.HealthyExtra1Name !=null)
        {
            Hamburgerprice+=this.HealthyExtra1Price;
            System.out.println("Added" + this.HealthyExtra1Name + "For An Extra" + this.HealthyExtra1Price);

        }
        if(this.HealthyExtra2Name !=null)
        {
            Hamburgerprice+=this.HealthyExtra2Price;
            System.out.println("Added" + this.HealthyExtra2Name + "For An Extra" + this.HealthyExtra2Price);

        }
        return Hamburgerprice;
    }
}
