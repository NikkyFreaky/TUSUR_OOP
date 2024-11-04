import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int n = in.nextInt();
        in.close();

        LinkedList<Integer> numList = new LinkedList<>();

        for (int i = 0; i < n; i++){
            numList.add((int)(Math.random() * 10));
        }
        System.out.println("Начальный список: " + numList);

        // Вставить в список число 0 перед каждым числом от 2 до 7
        int j = 0;
        while (j < numList.size()) {
            if (numList.get(j) >= 2 && numList.get(j) <= 7)
                numList.add(j++, 0);
            j++;
        }
        System.out.println("\nСписок после добавления 0 перед каждым числом от 2 до 7: " + numList);

        // Определить сумму чисел больших 7
        int sum = 0;
        for (Integer element : numList) {
            if (element > 7)
                sum += element;
        }
        System.out.println("Cумма чисел больших 7: " + sum);

        // Удалить из списка элементы, которые больше 5
        numList.removeIf(i -> (i > 5));
        System.out.println("Список после удаления элементов, которые больше 5: " + numList);
    }
}