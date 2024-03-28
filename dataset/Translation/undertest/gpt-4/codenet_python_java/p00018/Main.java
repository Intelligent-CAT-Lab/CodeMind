import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p00018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] numbersString = input.split(" ");
        Integer[] numbers = new Integer[numbersString.length];

        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}