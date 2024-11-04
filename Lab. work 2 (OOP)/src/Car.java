class Car extends Vehicle {
    String brand;
    public Car(String type,String brand, String model, String color, int diameter) {
        super(type, model, color, diameter);
        this.brand = brand;
    }

    public void printCar () {
        System.out.print("\nМарка автомобиля: " + brand);
        getValuesVehicle();
    }

}
