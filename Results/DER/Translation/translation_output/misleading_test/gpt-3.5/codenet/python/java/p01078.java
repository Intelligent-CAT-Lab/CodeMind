```java
// AOJ 1593: Star
// Java 11
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        double PI = 3.1415926535897932384626433832795;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double result = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.println(result);
        scanner.close();
    }
}
```
