package AbstractCar;

public class Hatchback extends BasicCar {
    private int maxSpeed;

    public Hatchback(String model, int vin, int miles, String colour, int maxSpeed) {
        super.setModel(model);
        setVin(vin);
        setMiles(miles);
        super.setColour(colour);
        setMaxSpeed(maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setVin(final int vin) { //konstruktor wywołuje metodę setVin, która wywołuje konstruktor
        super.setVin(vin); //tu jest rekurencja, jeśli nie ma super, zapełni się pamięć, exit code 1
    }

    public String getModel() {
        return super.getModel();
    }

    public String getColour() {
        return super.getColour();
    }

    public void setColour(final String mozeBycInnaNizColour) {
        super.setColour(mozeBycInnaNizColour); //tu tez bedzie rekurencja bez super?
    }

    public int getMiles() {
        return super.getMiles();
    }

    public void setMiles(final int miles) {
        super.setMiles(miles);
    }

    @Override
    public String toString() {
        return super.toString() + " maxSpeed=" + maxSpeed;    }
}
