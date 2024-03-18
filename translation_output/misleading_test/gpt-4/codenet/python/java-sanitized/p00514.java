import java.util.Scanner;
import java.util.Arrays;

public class p00514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputParts[0]);
        int m = Integer.parseInt(inputParts[1]);
        int r = Integer.parseInt(inputParts[2]);

        int[] sortedValues = {n - 1, r - m * n};
        Arrays.sort(sortedValues);
        int a = sortedValues[0];
        int b = sortedValues[1];

        long d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }

        long u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }

        if (a < 1) {
            System.out.println(0);
        } else {
            System.out.println(u / d);
        }
        scanner.close();
    }
}