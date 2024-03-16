import java.util.Scanner;
import java.util.Arrays;

public class p04005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = numbers[0] * numbers[1];
            }
        }
        System.out.println(ans);
    }
}