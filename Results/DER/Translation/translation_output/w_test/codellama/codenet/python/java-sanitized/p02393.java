import java.util.Scanner;

public class p02393 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] sortedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(sortedNumbers);
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }
    }
}