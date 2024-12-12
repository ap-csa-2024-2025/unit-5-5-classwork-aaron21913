public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int ssn;

    public Person(String fName, String lName. int iAge, String iSsn)
    {
        firstName = fName;
        lastName = lName;
        age = iAge;
        ssn = iSsn;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public int getAge() 
    {
        return age;
    }

    public String getSsn() 
    {
        return ssn;
    }

    
}
