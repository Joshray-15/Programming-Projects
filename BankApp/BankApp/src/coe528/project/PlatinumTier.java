package coe528.project;

public class PlatinumTier extends Tiers{

    @Override
    public void changeTier(Account a){
        if (a.getAmount() < 10000){
                a.setLevel(new SilverTier());
            }
        if (a.getAmount() < 20000 && a.getAmount() > 10000){
                a.setLevel(new GoldTier());
            }

        }
    @Override
    public void onlinePurchase(Account a,int cost){
        if ((cost >= 50) && (cost < a.getAmount())){
            a.withdraw(cost);
        }
       
        
    }       
    }
