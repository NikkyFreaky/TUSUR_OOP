import java.util.Scanner;

class Circle {
    double center_x;
    double center_y;
    double radius;

    public Circle(double radius, double center_x, double center_y) {
        this.radius = radius;
        this.center_x = center_x;
        this.center_y = center_y;
    }

    double CircleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    double CircumferenceLength(double radius){
        return 2 * Math.PI * radius;
    }

    void CircleInside(double user_x, double user_y){
        try {
            if (Math.pow(user_x - center_x, 2) + Math.pow(user_y - center_y, 2) <= Math.pow(radius, 2)) {
                System.out.println("\n\nТочка с координатами (" + user_x + "," + user_y + ") принадлежит окружности");
            }
            else throw new Exception("\n\nЗаданная точка не принадлежит окружности");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите радиус круга: ");
            double radius = in.nextDouble();
            if (radius <= 0) throw new Exception("\nРадиус круга не может быть отрицательным или равным 0");

            Circle circle1 = new Circle(radius, 0, 0);

            System.out.print("Введите координаты заданной точки:\n x = ");
            double x = in.nextDouble();
            System.out.print(" y = ");
            double y = in.nextDouble();
            in.close();

            System.out.printf("\nПлощадь круга = %.2f", circle1.CircleArea(radius));
            System.out.printf("\nДлина окружности = %.2f", circle1.CircumferenceLength(radius));
            circle1.CircleInside(x, y);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}