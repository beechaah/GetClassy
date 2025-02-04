import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // Person / People
        ArrayList<Person> people = new ArrayList<>();
        Person ally = new Person("Ally", "Farris", 2005);
        System.out.println(ally);
        people.add(ally);

        Person dylan = new Person("Dylan", "Williamson", 2009);
        System.out.println(dylan);
        people.add(dylan);

        Person maggie = new Person("Maggie", "Simons", 2020);
        System.out.println(maggie);
        people.add(maggie);

        for(Person p: people)
            System.out.println(p);

        System.out.println("\n\nNew Code for inheritance");

        System.out.println("\nFile Storage formats:");

        System.out.println("JSON: " + ally.toJSONRecord());
        System.out.println("XML:  " + ally.toXMLRecord());
        System.out.println("CSV:  "+ ally.toCSVRecord());


        //Product
        System.out.println();
        System.out.println();
        ArrayList<Product> product = new ArrayList<>();
        Product Hoodie = new Product("Hoodie", "Soft Hoodie", "000001", 50.00);
        System.out.println(Hoodie);
        product.add(Hoodie);


        Product Flashlight = new Product("Flashlight", "Brightest Flashlight", "000002", 50.00);
        System.out.println(Flashlight);
        product.add(Flashlight);

        Product Switch = new Product("Switch", "Switch Light form Nintendo", "000003", 200.00);
        System.out.println(Switch);
        product.add(Switch);

        for(Product p: product)
            System.out.println(p);

        System.out.println("\n\nNew Code for inheritance");

        System.out.println("\nFile Storage formats:");

        System.out.println("JSON: " + Hoodie.toJSONRecord());
        System.out.println("XML:  " + Hoodie.toXMLRecord());
        System.out.println("CSV:  "+ Hoodie.toCSVRecord());
    }
}
