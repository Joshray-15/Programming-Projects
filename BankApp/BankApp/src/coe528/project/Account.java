
package coe528.project;

/**

 * This class uses a state pattern, objects behaviors are dependent on the state of this class
 * 
 * The class is mutable as it has mutable functions.
 * 
*    abstraction function:
*    AF(c) =  account, c, such that
*    c.setAmount = amount
*    c.getAmount = amount
*    c.deposit = amount + deposit
*    c.withdraw = amount - withdraw
*    c.setLevel = l
*    c.getLevel = l
*   The rep invariant is:
*   c.setAmount >= 0 &amp
*   c.getAmount >= 0 &amp
*   c.deposit >= 0 &amp
*   c.withdraw >= 0 &amp
*   (c.getAmount - withdraw) >= 0 
*   c.getLevel =! null  
 */
public class Account{
   private int amount;
   private Tiers level;

    /**
     *
     * @param amount the initial balance of the account
     */
    public Account(int amount){
   this.amount = amount;
   }

    /**
     *
     * @param amount, the new balance of the account is set
     */
    public void setAmount(int amount) {
 
            this.amount = amount;
    //REQUIRES: value of money (int)
    //MODIFIES: starting value of amount 
    //EFFECTS: returns the amount
    }

    /**
     *
     * @return
     */
    public int getAmount() {  
        return amount;
           //EFFECTS: returns amount of money in account   
    }
   
    /**
     *
     * @param deposit the amount needed for depositing
     */
    public void  deposit(int deposit){
        if(deposit < 1){
            throw new NullPointerException();
        }
        amount = amount + deposit;
     //REQUIRES: value of money (int)
    //MODIFIES: adds money to previous balance
    //EFFECTS: gives new balance    
    }
    
    /**
     *
     * @param withdraw the money needed from the specific account
     */
    public void withdraw(int withdraw){
        if(withdraw < 1 || ((amount - withdraw)<0)){
            throw new NullPointerException();
        }
        amount = amount - withdraw;
        
    //REQUIRES: value of money (int)
    //MODIFIES: substraction of money withdrawn
    //EFFECTS: gives new amount
    

    }
    
    /**
     *
     * @param l this sets the accounts tier
     */
    public void setLevel(Tiers l){
    //REQUIRES: level(l)(siver,gold,platinum)    
    //MODIFIES: modifies the level
    //EFFECTS: returns the new level 
        level = l;
    }

    /**
     *
     * @return the current tier of the account
     */
    public Tiers getLevel(){
 // this method also ensures the level is up to date befotr returning
        if(amount< 10000){
            return level = new SilverTier();
        }
        if(amount >10000 && amount <20000){
        return level = new GoldTier();
        }
        return level = new PlatinumTier();
            //EFFECTS: gives the state/tier of the account 
    }
    
   /**
     * Checks if the representation invariant holds for this account.
     */
    public boolean repOK(){
if(amount >= 0){
    return true;
}
  if (level != null){
      return true;
  }
    
    return false;
  // EFFECTS: gives true if rep invariant is valid
}

    @Override
    public String toString() {

        return("Level: " + level + ", " + "Amount: " + amount);
           // EFFECTS: final amount returns
    }

}