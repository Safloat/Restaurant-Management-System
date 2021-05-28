package system;

public class Table
{
    private boolean status; //true if table is available, false if table is occupied
   // boolean payment_status; //true if payment is complete and false if not
    private float total_payment;
    private float payment_received;
    private boolean order_status;
    public Table()
    {

    }
    public boolean update_table_status(boolean inp)
    {
        status=inp;
        return true;
    }
    public boolean get_Table_Status()
    {
        return status;
    }
   public boolean payment_status() //returns whether customer has completed payment
    {
        return total_payment <= payment_received;
    }
    public boolean update_payment(float cash)
    {
        payment_received+=cash;
        return true;
    }
    public float getTotal_payment()
    {
        return total_payment;
    }

    public float getPayment_received()
    {
        return payment_received;
    }
    public boolean getOrder_status()
    {
        return order_status;
    }
    public boolean Update_Order_status(boolean inp)
    {
        order_status=inp;
        return true;
    }
}
