
// Represents a savings account
public class Savings extends Account{

    double interest; // The interest rate

    public Savings(int accountNum, int balance, String name, 
    		           double interest){
        super(accountNum, balance, name);
        this.interest = interest;
    }

    /* TEMPLATE:
     Fields:
     ... this.accountNum ...     -- int
     ... this.balance ...        -- int
     ... this.name ...           -- String
     ... this.interest ...       -- double
     
     Methods:
     ... this.amtAvailable() ...  -- int
     
     */
    
    // produce the amount available for withdrawal from this account
    public int amtAvailable(){
    	  return this.balance;
    }
}
