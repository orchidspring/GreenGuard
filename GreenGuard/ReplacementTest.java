
public class ReplacementTest {

    public static void main(String[] args) {
        Equipment equipment = new Equipment("Generic", "Tool", 2021);
        BatteryPoweredEquipment batteryPoweredEquipment = new BatteryPoweredEquipment("Green Guard", "Edge Trimmer", 2020, 4);
        FuelPoweredEquipment fuelPoweredEquipment = new FuelPoweredEquipment("Green Guard", "Lawn Mower", 2021, 2.5);

        System.out.println("Equipment replacement year: " + equipment.calculateReplacementYear());
        System.out.println("Battery powered equipment replacement year: " + batteryPoweredEquipment.calculateReplacementYear());
        System.out.println("Fuel powered equipment replacement year: " + fuelPoweredEquipment.calculateReplacementYear());
    }

}
