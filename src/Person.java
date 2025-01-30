public class Person
{
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;
    boolean doneInput = false;

    public void GetInfo()
    {
        ID = SafeInputObj.getNonZeroLenString("Enter your ID [******]");
        firstName = SafeInputObj.getNonZeroLenString("Enter your first name");
        lastName = SafeInputObj.getNonZeroLenString("Enter your last name");
        title = SafeInputObj.getNonZeroLenString("Enter your title");
        YOB = SafeInputObj.getRangedInt("Enter your Year of Birth", 1000, 9999);

        doneInput = SafeInputObj.getYNConfirm("Are you done ");
    }

    public void ReadInfo()
    {

    }

    // Constructor
    public Person(String firstName, String lastName, String ID, String title, int YOB)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    // Overloaded constructor
    public Person(String firstName, String lastName, String ID)
    {
        this(firstName, lastName, ID, "", 0);
    }

    // Getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    // Setters
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setYOB(int YOB)
    {
        this.YOB = YOB;
    }

    // Other methods
    public String fullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + fullName();
    }

    public int getAge(int year)
    {
        return year - YOB;
    }

    public String toCSV()
    {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    public String toJSON()
    {
        return "{\"firstName\":\"" + firstName + "\",\"lastName\":\"" + lastName + "\",\"ID\":\"" + ID + "\",\"title\":\"" + title + "\",\"YOB\":" + YOB + "}";
    }

    public String toXML()
    {
        return "<Person><firstName>" + firstName + "</firstName><lastName>" + lastName + "</lastName><ID>" + ID + "</ID><title>" + title + "</title><YOB>" + YOB + "</YOB></Person>";
    }

    @Override
    public String toString()
    {
        return fullName();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (YOB != person.YOB) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!lastName.equals(person.lastName)) return false;
        if (!ID.equals(person.ID)) return false;
        return title.equals(person.title);
    }


}
