```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            System.exit(0);
        }

        int k = -(-B / A);

        for (int i = k; i < k + (int) Math.pow(10, 7); i++) {
            int[] division = divide(i * A, B);
            int bn = division[0];
            int rem = division[1];
            division = divide(rem, A);
            int an = division[0];
            rem = division[1];
            int n = bn + an + rem;
            if (n > i) {
                System.out.println(i * A);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }

    private static int[] divide(int num, int divisor) {
        int[] result = new int[2];
        int quotient = num / divisor;
        int remainder = num % divisor;
        result[0] = quotient;
        result[1] = remainder;
        return result;
    }
}
```

