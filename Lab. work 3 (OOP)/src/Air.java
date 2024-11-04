public class Air extends Vehicle {
    int perm_height;

    public Air() {}

    public Air(String veh_type, String brand, String model, String color, int perm_height) {
        super(veh_type, brand, model, color);
        this.perm_height = perm_height;
    }

    public void setValues(String veh_type, String brand, String model, String color, int perm_height) {
        super.setValues(veh_type, brand, model, color);
        this.perm_height = perm_height;
    }

    public String getAirValues() {
        return "Допустимая высота полёта: " + this.perm_height + " метров над землёй";
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getAirValues();
    }
}
