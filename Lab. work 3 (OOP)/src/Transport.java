public class Transport extends Vehicle {
    int speed, weight;

    public Transport() {}

    public Transport(String veh_type, String brand, String model, String color, int speed, int weight) {
        super(veh_type, brand, model,color);
        this.speed = speed;
        this.weight = weight;
    }

    public void setValues(String veh_type, String brand, String model, String color, int speed, int weight) {
        super.setValues(veh_type, brand, model,color);
        this.speed = speed;
        this.weight = weight;
    }

    public String getTrValues() {
        return "Скорость: " + this.speed + " км/ч" + "\nВес ТС: " + this.weight + " кг";
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getTrValues();
    }
}
