public class Vehicle {
    private String veh_type, brand, model, color;

    public Vehicle() {}

    public Vehicle(String veh_type, String brand, String model, String color) {
        this.veh_type = veh_type;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void setValues(String veh_type, String brand, String model, String color) {
        this.veh_type = veh_type;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getValues() {
        return "\nТип ТС: " + this.veh_type + "\nМарка: " + this.brand + "\nМодель: " + this.model + "\nЦвет: " + this.color;
    }
}
