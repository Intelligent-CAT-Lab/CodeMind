import java.util.Arrays;
import java.util.Scanner;

public class p03387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[] numbers = {a, b, c};
        Arrays.sort(numbers);

        int x = numbers[2];
        int y = numbers[0];
        int z = numbers[1];

        if ((z - y) % 2 == 0) {
            System.out.println(x - z + (z - y) / 2);
        } else {
            System.out.println(x - z + 1 + (z - y + 1) / 2);
        }
    }
}