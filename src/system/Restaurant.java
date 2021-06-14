package system;

public class Restaurant
{
    private String restaurant_name;
    private Dine_in dine_in;
    private static Restaurant instance=null;
    private Account active=null;
    private DBHandler dbHandler;
    private Restaurant()
    {
        dine_in = Dine_in.get_dining();
        dbHandler=MySQLHandler.getDatabase();
        //dine_in = Dine_in.get_dining(no_of_tab);
    }
    public boolean Create_Manager_Account(String cnic_no, String name, String design)
    {
        //database function to add new manager entry
        dbHandler.Create_Manager_Account(cnic_no,name,design);
        return true;
    }
    public boolean Create_WaitingStaff_Account(String cnic_no, String name, String design)
    {
        //database function to add new waiting staff entry
        dbHandler.Create_WaitingStaff_Account(cnic_no, name, design);
        return true;
    }
    public boolean Create_KStaff_Account(String cnic_no, String name, String design)
    {
        dbHandler.Create_KStaff_Account(cnic_no, name, design);
        //database function to add new kitchen staff entry
        return true;
    }
    boolean Set_Restaurant_Name(String res_name)
    {
        restaurant_name=res_name;
        return true;
    }
    public void set_tables(int number_tables)
    {
        dine_in.Update_Tables(number_tables);
    }
    public static Restaurant get_instance()
    {
        if(instance==null) {
            instance= new Restaurant();
        }
        return instance;
    }
    public boolean Update_Tables(int new_Tab)
    {
        dine_in.Update_Tables(new_Tab);
        return true;
    }

    public int get_stock_quantity(int item_id)
    {
        //checks in DB for that specific item's quantity
        return 1;
    }

    public void update_stock(int item_id, int new_amt)
    {
        //sets the item in the stock corresponding to the item_id to new_amt
    }

    public boolean contact_Supplier()
    {
        //contacts supplier for all items below threshold quantity
        return true;//if successful
    }
    public boolean contact_Supplier(int item_id)
    {
        //contacts supplier for specific item
        return true; //if successful
    }
    public float get_daily_revenue()
    {
        //returns the daily revenue from the database
        return 0;
    }
    public float get_weekly_revenue()
    {
        //returns the daily revenue from the database
        return 0;
    }
    public float get_monthly_revenue()
    {
        //returns the daily revenue from the database
        return 0;
    }
    public float get_yearly_revenue()
    {
        return 0;
        //returns the daily revenue from the database
    }

    public boolean notify_manager_stock()
    {
        //notify manager when stock is running out
        return false;
    }


}
