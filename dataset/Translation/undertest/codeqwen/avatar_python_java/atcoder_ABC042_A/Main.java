import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] ABC = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ABC[i] = Integer.parseInt(numbers[i]);
        }
        int countFive = 0;
        int sum = 0;
        for (int num : ABC) {
            if (num == 5) {
                countFive++;
            }
            sum += num;
        }
        if (countFive == 2) {
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}