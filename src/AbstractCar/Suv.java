package AbstractCar;

public class Suv extends BasicCar {
    public Suv(String model, int vin, int miles, String colour) {
        super.setModel(model);
        setVin(vin);
        setMiles(miles);
        super.setColour(colour); //sztuczka do wzorca projektowego, pomija fragment //
        // łańcuszka - tu metode setColor w klasie Suv, bo przechodzi od razu do klasy rodzica BasicCar
    }

    public void setVin(final int vin) { //konstruktor wywołuje metodę setVin, która wywołuje konstruktor
        super.setVin(vin); //tu jest rekurencja, jeśli nie ma super, zapełni się pamięć, exit code 1
    }
    public String getModel() {
        return super.getModel();}

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
        return super.toString();
    }
}
