package system;
import java.util.ArrayList;
public class Dine_in
{
    private static Dine_in dining= null;
    int no_of_tables;
    private DBHandler db_Handler;
    boolean tables_empty; //false if any one table is occupied and true when no table is occupied
    boolean tables_available; //checks whether there are any tables available(true) or all are occupied(false)
    ArrayList<Table> tables;

    private Dine_in()
    {
       // this.no_of_tables=no_of_tables;
        //this.no_of_tables= get_tables_from_DB();
        db_Handler=MySQLHandler.getDatabase();
        tables = db_Handler.get_Tables();
        no_of_tables = tables.size();
        //tables= new ArrayList<Table>(no_of_tables);
    }
    public static Dine_in get_dining()
    {
        if (dining==null)
        {
            dining= new Dine_in();
        }
        return dining;
    }
    public boolean Update_Tables(int new_num_of_tables)
    {
        for( Table i: tables)
        {
            if(i.get_Table_Status())
            {
               return false; //cannot update table number if tables are already occupied
            }
        }
        no_of_tables=new_num_of_tables;
        tables= new ArrayList<Table>(no_of_tables);
        db_Handler.set_Tables(tables);
        return true;
    }
    public void Place_Order()
    {

    }
    public ArrayList<Integer> Book_Table(int tab_no)
    {
        if(tables.get(tab_no - 1).get_Table_Status()) {
            tables.get(tab_no-1).update_table_status(false);
            db_Handler.set_Tables(tables);
            return null;
        }
        else {
            ArrayList<Integer> available_tables;
            available_tables= new ArrayList<Integer>();
            int counter=0;
            for( Table i: tables)
            {
                counter++;
                if(i.get_Table_Status())
                {
                    available_tables.add(counter);
                }
            }
            return available_tables;
        }

    }
    public void Display_Available_Tables()
    {

    }
}
