import java.util.Scanner;

public class Main {
    public static void printMenu() {
        System.out.println("\n-----МЕНЮ----\n1.Велосипед\n2.Автомобиль\n--------------");
        System.out.print("Выберите какой объект хотите создать (1-2): ");
    }

    public static void choiceMenu(int choice, int diameter) {
        Scanner in = new Scanner(System.in);
        String model, brand, color;

        switch (choice) {
            case 1:
                System.out.print("\nВыбран объект 'Велосипед'\n");
                System.out.print("Введите модель велосипеда: ");
                model = in.nextLine();
                System.out.print("Введите цвет: ");
                color = in.nextLine();
                Bicycle bike1 = new Bicycle("Велосипед", model, color, diameter);
                bike1.printBicycle();
                in.close();
                break;
            case 2:
                System.out.print("\nВыбран объект 'Автомобиль'\n");
                System.out.print("Введите марку автомобиля: ");
                brand = in.nextLine();
                System.out.print("Введите модель: ");
                model = in.nextLine();
                System.out.print("Введите цвет: ");
                color = in.nextLine();
                Car car1 = new Car("Автомобиль", brand, model, color, diameter);
                car1.printCar();
                in.close();
                break;
            default:
                System.out.println("Ошибка выбора операции.Сделайте выбор и введите номер операции!");
                break;
        }

    }

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int diameter;

            System.out.print("Введите диаметр колёс: ");
            diameter = in.nextInt();
            if (diameter <= 0) throw new Exception("Введено неправильное значение");

            printMenu();
            choiceMenu(in.nextInt(), diameter);
            in.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

}
