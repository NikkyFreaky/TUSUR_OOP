public class Ship extends Vehicle {
    private String destiny;

    public Ship() {}

    public Ship(String veh_type, String brand, String model, String color, String destiny) {
        super(veh_type, brand, model, color);
        this.destiny = destiny;
    }

    public void setValues(String veh_type, String brand, String model, String color, String destiny) {
        super.setValues(veh_type, brand, model, color);
        this.destiny = destiny;
    }

    public String getShipValues() {
        return "Вид коробля: " + this.destiny;
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getShipValues();
    }
}
