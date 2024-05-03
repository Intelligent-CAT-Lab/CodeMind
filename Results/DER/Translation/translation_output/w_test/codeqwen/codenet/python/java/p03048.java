Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        int cnt = 0;
        for (int r = 0; r <= n / R; r++) {
            for (int g = 0; g <= (n - r * R) / G; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, then it calculates the number of combinations of R, G, and B that sum up to n. It then prints out the number of such combinations.
