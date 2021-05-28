package system;

public abstract class Account
{
    String cnic_number;
    String designation;
    String name;
    float salary;

    public Account(String cnic_num, String n,String des)
    {
        cnic_number=cnic_num;
        name=n;
        designation=des;
    }
    public float getSalary()
    {
        return salary;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getCnic_number()
    {
        return cnic_number;
    }

    public String getName()
    {
        return name;
    }
}
