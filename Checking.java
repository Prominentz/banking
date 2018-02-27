
// Represents a checking account
public class Checking extends Account{

    int minimum; // The minimum account balance allowed

    public Checking(int accountNum, int balance, String name, int minimum){
        super(accountNum, balance, name);
        this.minimum = minimum;
    }

    /* TEMPLATE:
     Fields:
     ... this.accountNum ...     -- int
     ... this.balance ...        -- int
     ... this.name ...           -- String
     ... this.minimum ...        -- int
     
     Methods:
     ... this.amtAvailable() ...  -- int
     
     */
    
    // produce the amount available for withdrawal from this account
    public int amtAvailable(){
    	  return this.balance - this.minimum;
    }
}
