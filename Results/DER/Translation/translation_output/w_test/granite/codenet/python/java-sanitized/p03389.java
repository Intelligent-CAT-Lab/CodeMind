import java.util.Arrays;
import java.util.Scanner;

public class p03389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = numbers[2] - numbers[i];
            s += tmp / 2;
            numbers[i] += tmp / 2 * 2;
        }
        s += (numbers[0] + numbers[1] + numbers[2]) % 3;
        System.out.println(s);
    }
}