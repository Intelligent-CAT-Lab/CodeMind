```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }

        System.out.println(ret);
    }
}
```
Copy and paste this Java code into your IDE or text editor to run the provided test case.
