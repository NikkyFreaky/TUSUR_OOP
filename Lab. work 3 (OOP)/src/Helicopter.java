public class Helicopter extends Air {
    private int capacity;
    public Helicopter() {}

    public Helicopter(String veh_type, String brand, String model, String color, int perm_height, int capacity) {
        super(veh_type, brand, model, color, perm_height);
        this.capacity = capacity;
    }

    public void setValues(String veh_type, String brand, String model, String color, int perm_height, int capacity) {
        super.setValues(veh_type, brand, model, color, perm_height);
        this.capacity = capacity;
    }

    public String getHelValues() {
        return "Объём топливного бака: " + this.capacity + " литров";
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getHelValues();
    }
}
