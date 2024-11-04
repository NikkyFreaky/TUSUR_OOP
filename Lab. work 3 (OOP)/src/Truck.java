public class Truck extends Transport {
    private boolean isLoaded;

    public Truck() {}

    public Truck(String veh_type, String brand, String model, String color, int speed, int weight, boolean isLoaded) {
        super(veh_type, brand, model, color, speed, weight);
        this.isLoaded = isLoaded;
    }

    public void setValues(String veh_type, String brand, String model, String color, int speed, int weight, boolean isLoaded) {
        super.setValues(veh_type, brand, model, color, speed, weight);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public String getLoaded() {
        if (isLoaded)
            return "Загруженность: грузовик загружен";
        else
            return "Загруженность: грузовик не загружен";
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }
}
