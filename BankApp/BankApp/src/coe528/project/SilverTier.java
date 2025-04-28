package coe528.project;

public class SilverTier extends Tiers{

    
    @Override
    public void changeTier(Account a){
        if (a.getAmount() > 10000 && a.getAmount() < 20000) {
            a.setLevel(new GoldTier());
        }
        if (a.getAmount() > 20000){
            a.setLevel(new PlatinumTier());
        }
       
    }
    
    @Override
    public void onlinePurchase(Account a,int cost){
        if ((cost >= 50) && (cost < a.getAmount())){
            a.withdraw(cost);
        }
        
     
        
    }
}
