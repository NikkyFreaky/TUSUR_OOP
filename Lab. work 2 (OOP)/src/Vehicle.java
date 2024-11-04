class Vehicle extends Wheel {

    private String type;
    private String model;
    private String color;

    public Vehicle(String type, String model, String color, int diameter) {
        super(diameter);
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public void setValuesVehicle(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public void getValuesVehicle() {
        System.out.println("\nТип транспортного средства: " + type);
        System.out.println("Модель: " + model);
        System.out.println("Цвет: " + color);
        getValuesWheel();
    }
}
