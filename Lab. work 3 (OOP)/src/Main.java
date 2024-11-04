import java.util.Scanner;

public class Main {
    public static void printVehMenu() {
        System.out.println("\n------МЕНЮ------\n1)Наземное ТС\n2)Воздушное ТС\n3)Корабль\n----------------");
        System.out.print("Выберите какое транспортное средство хотите создать (1-3): ");
    }

    public static void printTsMenu() {
        System.out.println("\n------НАЗЕМНОЕ ТС------\n1)Легковой автомобиль\n2)Грузовой автомобиль\n-----------------------");
        System.out.print("Выберите какой тип автомобиля хотите создать (1-2): ");
    }

    public static void printAirMenu() {
        System.out.println("\n------ВОЗДУШНОЕ ТС------\n1)Вертолёт\n2)Самолёт\n------------------------");
        System.out.print("Выберите какой тип воздушного ТС хотите создать (1-2): ");
    }

    public static void choiceTsMenu(int choice) {
        Scanner in = new Scanner(System.in);

        String veh_type, brand, color, model;
        int speed, weight, diameter;
        boolean isLoaded;

        switch (choice) {
            case 1:
                //veh_type = "Легковой автомобиль"; brand = "KIA"; model = "Spectra RS"; color = "Серый"; speed = 180; weight = 2250; diameter = 16;
                Car car1 = new Car();

                veh_type = "Легковой автомобиль";
                System.out.print("\nВыбран объект легковой автомобиль;\nВведите марку: ");
                brand = in.nextLine();
                System.out.print("Введите модель: ");
                model = in.nextLine();
                System.out.print("Введите цвет: ");
                color = in.nextLine();
                System.out.print("Введите максимальную скорость: ");
                speed = in.nextInt();
                System.out.print("Введите вес ТС: ");
                weight = in.nextInt();
                System.out.print("Введите диаметр колёс: ");
                diameter = in.nextInt();
                in.close();

                System.out.println("\nСоздан объект легковой автомобиль");
                car1.setValues(veh_type, brand, model, color, speed, weight, diameter);
                System.out.println(car1.getValues());
                break;
            case 2:
                //veh_type = "Грузовой автомобиль"; brand = "Volvo"; model = "FH16"; color = "Белый"; speed = 130; weight = 7250; isLoaded = true;
                Truck truck1 = new Truck();

                veh_type = "Грузовой автомобиль";
                System.out.print("\nВыбран объект грузовой автомобиль;\nВведите марку: ");
                brand = in.nextLine();
                System.out.print("Введите модель: ");
                model = in.nextLine();
                System.out.print("Введите цвет: ");
                color = in.nextLine();
                System.out.print("Введите максимальную скорость: ");
                speed = in.nextInt();
                System.out.print("Введите вес ТС: ");
                weight = in.nextInt();
                System.out.print("Грузовик загружен (true - да, false - нет): ");
                isLoaded = in.nextBoolean();
                in.close();

                System.out.println("\nСоздан объект грузовой автомобиль");
                truck1.setValues(veh_type, brand, model, color, speed, weight, isLoaded);
                System.out.println(truck1.getValues());
                break;
            default:
                System.out.println("\nОшибка выбора операции.Сделайте правильный выбор и введите номер операции!");
                printTsMenu();
                choiceTsMenu(in.nextInt());
                in.close();
        }
    }

    public static void choiceAirMenu(int choice) {
        Scanner in = new Scanner(System.in);

        String veh_type, brand, model, color;
        int perm_height, capacity, quantity;

        switch (choice) {
            case 1:
                //veh_type = "Вертолёт"; brand = "Robinson"; model = "R44"; color = "Синий"; perm_height = 8250; capacity = 1000;
                Helicopter helicopter1 = new Helicopter();

                veh_type = "Вертолёт";
                System.out.print("\nВыбран объект вертолёт;\nВведите марку: ");
                brand = in.nextLine();
                System.out.print("Введите модель: ");
                model = in.nextLine();
                System.out.print("Введите цвет: ");
                color = in.nextLine();
                System.out.print("Введите максимально допустимую высоту полёта: ");
                perm_height = in.nextInt();
                System.out.print("Введите объём топливного бака: ");
                capacity = in.nextInt();
                in.close();

                System.out.println("\nСоздан объект вертолёт");
                helicopter1.setValues(veh_type, brand, model, color, perm_height, capacity);
                System.out.println(helicopter1.getValues());
                break;
            case 2:
                //veh_type = "Самолёт"; brand = "Airbus"; model = "A320"; color = "Зелёный"; perm_height = 12000; quantity = 320;
                Airplane air1 = new Airplane();

                veh_type = "Самолёт";
                System.out.print("\nВыбран объект самолёт;\nВведите марку: ");
                brand = in.nextLine();
                System.out.print("Введите модель: ");
                model = in.nextLine();
                System.out.print("Введите цвет: ");
                color = in.nextLine();
                System.out.print("Введите максимально допустимую высоту полёта: ");
                perm_height = in.nextInt();
                System.out.print("Введите максимально допустимое кол-во пассажиров на борту: ");
                quantity = in.nextInt();
                in.close();

                System.out.println("\nСоздан объект самолёт");
                air1.setValues(veh_type, brand, model, color, perm_height, quantity);
                System.out.println(air1.getValues());
                break;
            default:
                System.out.println("\nОшибка выбора операции.Сделайте правильный выбор и введите номер операции!");
                printTsMenu();
                choiceTsMenu(in.nextInt());
                in.close();
        }
    }

    public static void choiceVehMenu(int choice) {
        Scanner in = new Scanner(System.in);

        String veh_type, brand, model, color, destiny;

        switch (choice) {
            case 1:
                printTsMenu();
                choiceTsMenu(in.nextInt());
                in.close();
                break;
            case 2:
                printAirMenu();
                choiceAirMenu(in.nextInt());
                in.close();
                break;
            case 3:
                //veh_type = "Корабль"; brand = "Туристический лайнер"; model = "Титаник"; color = "Чёрно-белый"; destiny = "Пассажирский";
                Ship ship1 = new Ship();

                veh_type = "Корабль";
                System.out.print("\nВыбран объект корабль;\nВведите марку: ");
                brand = in.nextLine();
                System.out.print("Введите модель: ");
                model = in.nextLine();
                System.out.print("Введите цвет: ");
                color = in.nextLine();
                System.out.print("Введите назначение данного транспорта: ");
                destiny = in.nextLine();
                in.close();

                System.out.println("\nСоздан объект корабль");
                ship1.setValues(veh_type, brand, model, color, destiny);
                System.out.println(ship1.getValues());
                break;
            default:
                System.out.println("\nОшибка выбора операции.Сделайте правильный выбор и введите номер операции!");
                printVehMenu();
                choiceVehMenu(in.nextInt());
                in.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printVehMenu();
        choiceVehMenu(in.nextInt());
        in.close();
    }
}