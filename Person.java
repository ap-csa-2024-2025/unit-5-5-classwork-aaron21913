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
    
    public void setAge(int personAge) 
    {
        if (personAge >= 0) 
        {
            age = personAge;
        } 
        else {
            System.out.println("Age must be a non-negative value.");
        }
    }
    
     public void setSsn(String personSsn) 
    {
        if (personSsn.length() == 9 && personSsn.matches("\\d+")) 
        {
            ssn = personSsn;
        } else {
            System.out.println("SSN must be a 9-digit number.");
        }
    }

    
}
