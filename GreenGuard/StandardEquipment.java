public class StandardEquipment extends Equipment {

    private int maximumLifespan;
    private double durabilityFactor;
    private int purchaseYear;

    public StandardEquipment(String name, int quantity, int maximumLifespan, double durabilityFactor, int purchaseYear) {
        super(name, quantity);
        this.maximumLifespan = maximumLifespan;
        this.durabilityFactor = durabilityFactor;
        this.purchaseYear = purchaseYear;
    }

    public int getMaximumLifespan() {
        return maximumLifespan;
    }

    public void setMaximumLifespan(int maximumLifespan) {
        this.maximumLifespan = maximumLifespan;
    }

    public double getDurabilityFactor() {
        return durabilityFactor;
    }

    public void setDurabilityFactor(double durabilityFactor) {
        this.durabilityFactor = durabilityFactor;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public int calculateReplacementYear() {
        return (int) (maximumLifespan * durabilityFactor + purchaseYear);
    }
}