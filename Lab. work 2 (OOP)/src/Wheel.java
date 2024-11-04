class Wheel {

    private int diameter;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public void setValuesWheel(int diameter) {
        this.diameter = diameter;
    }

    public void getValuesWheel() {
        System.out.println("Диаметр колёс: " + diameter);
    }

}
