import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = in.nextInt();
        in.close();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 10);
        }

        System.out.print("Начальный массив:" + Arrays.toString(arr));

        int[] pop = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    pop[i]++;
                }
            }
        }

        int most_popResult = arr[0];
        int popResult = pop[0];
        for (int i = 0; i < n; i++) {
            if (pop[i] > popResult) {
                popResult = pop[i];
                most_popResult = arr[i];
            }
            if ((popResult == pop[i]) && (arr[i] < most_popResult)) {
                most_popResult = arr[i];
            }
        }

        System.out.println("\nНаиболее часто встречающееся число: " + most_popResult);
    }

}