package system;

import java.sql.*;

import java.util.ArrayList;

public class MySQLHandler extends DBHandler {

    Connection connection;

    private MySQLHandler()
    {
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://bmlx3df4ma7r1yh4.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/whpeq0z0sw1xgun1?useSSL=false&zeroDateTimeBehavior =convertToNull", "zoxkv6ykzzh799xk", "vs6iw8e6414sbimm");
        }catch (SQLException e) {
           // printSQLException(e);
        }
    }

    @Override
    public ArrayList<Table> get_Tables() {
        return null;
    }

    @Override
    public boolean Create_KStaff_Account(String cnic_no, String name, String design){
        return false;
    }

    @Override
    public boolean Create_Manager_Account(String cnic_num, String n, String des) {
        return false;
    }

    @Override
    public boolean Create_WaitingStaff_Account(String cnic_no, String name, String design) {
        return false;
    }

    @Override
    public boolean set_Tables(ArrayList<Table> table_d) {
        return false;
    }
    public static MySQLHandler getDatabase()
    {
        if(database==null)
        {
            database= new MySQLHandler();
        }
        return (MySQLHandler)database;
    }
}
