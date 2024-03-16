import java.util.Arrays;
import java.util.Scanner;

public class p03671 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStrings = scanner.nextLine().split(" ");
        int[] numbers = new int[inputStrings.length];

        for(int i = 0; i < inputStrings.length; i++) {
            numbers[i] = Integer.parseInt(inputStrings[i]);
        }

        Arrays.sort(numbers);
        System.out.println(numbers[0] + numbers[1]);

        scanner.close();
    }
}