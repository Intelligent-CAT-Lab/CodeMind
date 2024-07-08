
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextInt();
        final int k = scanner.nextInt();

        if (k == 0) {
            System.out.println(n * n);
            return;
        }

        long answer = 0;
        for (int b = k + 1; b <= n; b++) {
var newVariable_0 = Math.max(n % b - k + 1, 0);            answer += n / b * (b - k) + newVariable_0;
        }

        System.out.println(answer);
    }
}
