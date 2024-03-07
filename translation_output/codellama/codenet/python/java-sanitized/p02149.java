import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        int max = intNumbers[0];
        for (int i = 1; i < intNumbers.length; i++) {
            if (intNumbers[i] > max) {
                max = intNumbers[i];
            }
        }
        if (intNumbers[0] == max) {
            System.out.println("A");
        } else if (intNumbers[1] == max) {
            System.out.println("B");
        } else if (intNumbers[2] == max) {
            System.out.println("C");
        }
    }
}