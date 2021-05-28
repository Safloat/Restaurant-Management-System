package system;

public class Restaurant
{
    private String restaurant_name;
    private Dine_in dine_in;
    private static Restaurant instance=null;
    private Account active=null;
    private Restaurant(int no_of_tables)
    {
        dine_in = Dine_in.get_dining(no_of_tables);
    }
    public boolean Create_Manager_Account(String cnic_no, String name, String design)
    {
        //database function to add new manager entry
        return true;
    }
    public boolean Create_WaitingStaff_Account(String cnic_no, String name, String design)
    {
        //database function to add new waiting staff entry
        return true;
    }
    public boolean Create_KStaff_Account(String cnic_no, String name, String design)
    {
        //database function to add new kitchen staff entry
        return true;
    }
    public boolean Set_no_of_Tables_in_DB(int new_Tables)
    {
        return true;
    }

    boolean Set_Restaurant_Name(String res_name)
    {
        restaurant_name=res_name;
        return true;
    }
    public static Restaurant get_instance(int no_of_tables)
    {
        if(instance==null) {
            instance= new Restaurant(no_of_tables);
        }
        return instance;
    }
    public boolean Update_Tables(int new_Tab)
    {
        dine_in.Update_Tables(new_Tab);
        return true;
    }
}
