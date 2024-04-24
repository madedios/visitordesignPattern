package visitorPattern;

public interface TelcoSubscription {
    public String accept(UsagePromo usagePromo, double price);
    public String accept(UnliCallOffer unliPackage, boolean unliCallText);
}
