package visitorPattern;

public class Telco  implements TelcoSubscription{
    private Integer dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(Integer dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usagePromo, double price){
        this.promoPrice = price;
        return usagePromo.showAllowance(telcoName, promoPrice);
    }
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText){
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

   
    public String getTelcoName() {
        return telcoName;
    }

   
    public double getPromoPrice() {
        return promoPrice;
    }
    
    public Integer getDataAllowance() {
        return dataAllowance;
    }

    
    public boolean getUnliCallText() {
        return unliCallText;
    }


    public boolean isUnliCallText() {
        return unliCallText;
    }

   
}
