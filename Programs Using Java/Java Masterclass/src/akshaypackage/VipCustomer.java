package akshaypackage;

public class VipCustomer {
    String name;
    double limit;
    String email_address;

    public VipCustomer() {
        this("default",0.00,"default@email.com");
    }
    public VipCustomer(String name, double limit) {
        this(name,limit,"unknown@email.com");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail_address() {
        return email_address;
    }

    public VipCustomer(String name, double limit, String email_address) {
        this.name = name;
        this.limit = limit;
        this.email_address = email_address;
    }
}
