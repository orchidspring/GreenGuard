
public class BatteryPoweredEquipment extends Equipment {

    private int batteryLife;

    public BatteryPoweredEquipment(String make, String model, int purchaseYear, int batteryLife) {
        super(make, model, purchaseYear);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public int calculateReplacementYear() {
        // Implement the formula for calculating replacement year for battery powered equipment
        // For example: return getPurchaseYear() + getBatteryLife() / 2;
        // This is just an example, the actual formula may vary depending on the specific use case
        return getPurchaseYear() + getBatteryLife() / 2;
    }
}
