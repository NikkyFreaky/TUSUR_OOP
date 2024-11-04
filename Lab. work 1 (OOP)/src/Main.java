import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isTrue = false;
        while(!isTrue) {
            try {
                Scanner scan_num = new Scanner(System.in);
                System.out.print("Введите номер квартиры: ");
                int room_num = scan_num.nextInt();

                if (room_num > 0) {
                    isTrue = true;
                    int room_floor;

                    room_floor = room_num / 3;

                    if (room_num % 3== 1) {
                        room_floor++;
                        System.out.println("Квартира расположена слева на " + room_floor + " этаже");
                    }
                    if (room_num % 3 == 0) {
                        System.out.println("Квартира расположена справа на " + room_floor + " этаже");
                    }
                    if (room_num % 3 == 2) {
                        room_floor++;
                        System.out.println("Квартира расположена по центру на " + room_floor + " этаже");
                    }
                }
            } catch (Exception e) {
                System.out.println("Введено неправильное число");
            }
        }
    }
}
