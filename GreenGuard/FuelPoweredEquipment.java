
public class FuelPoweredEquipment extends Equipment {

    private double fuelEfficiency;

    public FuelPoweredEquipment(String make, String model, int purchaseYear, double fuelEfficiency) {
        super(make, model, purchaseYear);
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public int calculateReplacementYear() {
        // Implement the formula for calculating replacement year for fuel powered equipment
        // For example: return getPurchaseYear() + (int) (10 / getFuelEfficiency());
        // This is just an example, the actual formula may vary depending on the specific use case
        return getPurchaseYear() + (int) (10 / getFuelEfficiency());
    }
}
