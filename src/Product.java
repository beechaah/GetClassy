public class Product
{
    private String name;
    private String description;
    private String ID;
    private double cost;

    // Constructor
    public Product(String name, String description, String ID, double cost)
    {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    // Overloaded constructor
    public Product(String name, String ID)
    {
        this(name, "", ID, 0.0);
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getID()
    {
        return ID;
    }

    public double getCost()
    {
        return cost;
    }

    // Setters
    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    // Other methods
    public String toCSV()
    {
        return name + "," + description + "," + ID + "," + cost;
    }

    public String toJSON()
    {
        return "{\"name\":\"" + name + "\",\"description\":\"" + description + "\",\"ID\":\"" + ID + "\",\"cost\":" + cost + "}";
    }

    public String toXML()
    {
        return "<Product><name>" + name + "</name><description>" + description + "</description><ID>" + ID + "</ID><cost>" + cost + "</cost></Product>";
    }

    @Override
    public String toString()
    {
        return name + " (" + ID + ")";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.cost, cost) != 0) return false;
        if (!name.equals(product.name)) return false;
        if (!description.equals(product.description)) return false;
        return ID.equals(product.ID);
    }
}
