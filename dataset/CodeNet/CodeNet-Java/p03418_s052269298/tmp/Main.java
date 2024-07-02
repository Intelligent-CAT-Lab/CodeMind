
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextInt();
System.out.println("[INST]6;n;scanner.nextInt();"+n);
        final int k = scanner.nextInt();
System.out.println("[INST]7;k;scanner.nextInt();"+k);

        if (k == 0) {
            System.out.println(n * n);
            return;
        }

        long answer = 0;
        for (int b = k + 1; b <= n; b++) {
            answer += n / b * (b - k) + Math.max(n % b - k + 1, 0);
System.out.println("[INST]16;None;Math.max(n % b - k + 1, 0);"+Math.max(n % b - k + 1, 0));
        }

        System.out.println(answer);
    }
}
