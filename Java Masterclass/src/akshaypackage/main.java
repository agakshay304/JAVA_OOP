package akshaypackage;

public class main {

    public static void main(String[] args)
    {
    VipCustomer person1=new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2=new VipCustomer("akshay",25.0);
        System.out.println(person2.getName());
        System.out.println(person2.getLimit());
        System.out.println(person2.getEmail_address());
    VipCustomer person3=new VipCustomer("akanksha",50.0,"akanksha.gupta041@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getLimit());
        System.out.println(person3.getEmail_address());
    }
}
