import java.util.Scanner;
import java.util.Arrays;

public class p00514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, r;
        n = scanner.nextInt();
        m = scanner.nextInt();
        r = scanner.nextInt();

        int[] arr = { n - 1, r - m * n };
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];

        long d = 1;
        for (int i = 0; i < a; i++) {
            d *= (i + 1);
        }

        long u = 1;
        for (int i = 0; i < a + b; i++) {
            u *= (i + 1);
        }

        long result = a < 1 ? 0 : u / d;
        System.out.println(result);

        scanner.close();
    }
}