```java
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        Scanner scanner = new Scanner(bis);

        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        System.out.println(main(N, d, x));
    }

    public static double main(int N, int d, int x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        return ret;
    }
}
```
