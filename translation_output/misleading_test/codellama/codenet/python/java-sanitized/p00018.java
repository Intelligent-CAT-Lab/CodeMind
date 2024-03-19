import java.util.Scanner;

public class p00018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        int[] reversedSortedNumbers = new int[intNumbers.length];
        for (int i = 0; i < intNumbers.length; i++) {
            reversedSortedNumbers[i] = intNumbers[intNumbers.length - 1 - i];
        }
        for (int i = 0; i < reversedSortedNumbers.length; i++) {
            System.out.print(reversedSortedNumbers[i] + " ");
        }
    }
}