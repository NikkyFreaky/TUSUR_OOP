public class Car extends Transport {
    private int diameter;

    public Car() {}

    public Car(String veh_type, String brand, String model, String color, int speed, int weight, int diameter) {
        super(veh_type, brand, model,color, speed, weight);
        this.diameter = diameter;
    }

    public void setValues(String veh_type, String brand, String model, String color, int speed, int weight, int diameter) {
        super.setValues(veh_type, brand, model, color, speed, weight);
        this.diameter = diameter;
    }

    public String getCarValues() {
        return "Диаметр колёс: " + this.diameter + " дюймов";
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getCarValues();
    }
}
