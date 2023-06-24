
public abstract class Equipment {

    private String make;
    private String model;
    private int purchaseYear;

    public Equipment(String make, String model, int purchaseYear) {
        this.make = make;
        this.model = model;
        this.purchaseYear = purchaseYear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public abstract int calculateReplacementYear();
}
