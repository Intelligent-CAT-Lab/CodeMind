```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX = (int) 1e9 + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;

        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println(((factorial(N) * factorial(M) * 2) % MAX));
        } else {
            System.out.println((factorial(N) * factorial(M) % MAX));
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % ((int) 1e9 + 7);
        }
        return result;
    }
}
```
