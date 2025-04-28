
package coe528.project;

public class Customer extends Profile{

    Account account;

    public Customer(String name, String password, Account account, int b) {
        super.setUsername(name);
        super.setPass(password);
        setPosition();
        this.account = new Account(b);
        
    }
    
    public Account getBankAccount(){
        return account;
    }
    

    
    @Override
    public void setPosition() {
        super.Position = "Customer";
    }
    
}