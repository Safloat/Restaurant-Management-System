package system;

import java.util.ArrayList;

public abstract class DBHandler
{
    public abstract boolean set_Tables(ArrayList<Table> table_d);
    public abstract ArrayList<Table> get_Tables();
    public abstract boolean Create_Manager_Account(String cnic_num, String n, String des);
    public abstract boolean Create_WaitingStaff_Account(String cnic_no, String name, String design);
    public abstract boolean Create_KStaff_Account(String cnic_no, String name, String design);
    protected static DBHandler database=null;
}
