import java.io.*;
import java.util.*;

public class Main {
    public static void printMenu() {
        System.out.println ("\n>[1] - Вывести коллекцию на экран\n" +
                ">[2] - Добавить факультет в коллекцию\n" +
                ">[3] - Загрузить из файла\n" +
                ">[4] - Сохранить в файл\n" +
                ">[0] - Выйти из программы");
        System.out.print("\n>>> ");
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Scanner inFaculty = new Scanner(System.in);

        ArrayList<Faculty> facultyList = new ArrayList<>();
        facultyList.add(new Faculty("ФСУ", "ФЭТ","410", "+7 (3822) 70-15-46","Салмина Н.Ю."));
        String fileName = "output.txt";

        printMenu();
        while (true) {
            File file = new File(fileName);
            int choice = in.nextInt();

            if (choice == 0) {
                // Выход из программы
                System.out.print("\nВыход...\n");
                System.exit(0);
            }
            else if (choice == 1) {
                // Вывод коллекции на экран
                System.out.print("\nИнформация про факультеты:\n");
                System.out.println(facultyList);
            }
            else if (choice == 2) {
                // Добавление факультета в коллекцию
                System.out.print("\nВведите название факультета: ");
                String NameFaculty = inFaculty.nextLine();
                System.out.print("Введите название корпуса: ");
                String Corps = inFaculty.nextLine();
                System.out.print("Введите номер аудитории: ");
                String Room = inFaculty.nextLine();
                System.out.print("Введите контактный телефон: ");
                String Telephone = inFaculty.nextLine();
                System.out.print("Введите фамилию декана: ");
                String NameDean = inFaculty.nextLine();

                Faculty newFaculty = new Faculty(NameFaculty, Corps, Room, Telephone, NameDean);
                facultyList.add(newFaculty);

                System.out.print("\nИнформация про добавленный факультет:" + newFaculty.toString());
            }
            else if (choice == 3) {
                // Закрузка из файла
                BufferedReader reader = new BufferedReader(new FileReader("input.txt")); // буферизированный символьный поток
                ArrayList<String> fileInput = new ArrayList<>();

                while (reader.ready()) { // пока есть данные
                    fileInput.add(reader.readLine()); // считываем информацию из файла
                }

                facultyList.add(new Faculty(fileInput.get(0),fileInput.get(1), fileInput.get(2), fileInput.get(3), fileInput.get(4)));
                fileInput.clear();
                reader.close();

                System.out.print("\nВыполнена загрузка из файла input.txt в коллекцию\n");
            }
            else if (choice == 4) {
                // Сохранение в файл
                FileWriter writer = new FileWriter(file);
                writer.write(facultyList.toString());
                writer.close();

                System.out.print("\nВыполнено сохранение из коллекции в файл output.txt\n");
            }
            printMenu();
        }
    }
}