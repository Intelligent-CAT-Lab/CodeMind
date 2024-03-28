import java.util.Arrays;
import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(numbers[0] + numbers[1] + numbers[2] - numbers[2]);
    }
}