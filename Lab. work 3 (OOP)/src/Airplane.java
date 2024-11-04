public class Airplane extends Air {
    private int quantity;
    public Airplane() {}

    public Airplane(String veh_type, String brand, String model, String color, int perm_height, int quantity) {
        super(veh_type, brand, model, color, perm_height);
        this.quantity = quantity;
    }

    public void setValues(String veh_type, String brand, String model, String color, int perm_height, int quantity) {
        super.setValues(veh_type, brand, model, color, perm_height);
        this.quantity = quantity;
    }

    public String getApValues() {
        return "Максимальное кол-во пассажиров на борту: " + this.quantity;
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getApValues();
    }
}
