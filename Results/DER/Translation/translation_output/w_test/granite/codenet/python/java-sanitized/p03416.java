import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int firstNumber = Integer.parseInt(input[0]);
        int secondNumber = Integer.parseInt(input[1]);
        int count = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            String numberString = Integer.toString(i);
            String reversedNumberString = new StringBuilder(numberString).reverse().toString();

            if (numberString.equals(reversedNumberString)) {
                count++;
            }
        }

        System.out.println(count);
    }
}