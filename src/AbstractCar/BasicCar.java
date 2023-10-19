package AbstractCar;

public abstract class BasicCar {
//user id plus id uzytkownika ktory wypozyczyl konkretne auto, priorytet, do klas dodac equals and hashcode
    private String model;
    private int vin;
    private String colour;
    private int miles;

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(final int vin) {
        this.vin = vin;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(final int miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "BasicCar{" +
                "model='" + model + '\'' +
                ", vin=" + vin +
                ", colour='" + colour + '\'' +
                ", miles=" + miles + '\'' +
               //dodac do hatchback ", maxSpeed=" + maxSpeed +
                '}';
    }
}
