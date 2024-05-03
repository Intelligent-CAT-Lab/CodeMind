Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double PI = 3.1415926535897932384626433832795;
        // area = n*r^2*sin(180/n)*cos(180k/n)*sec(180(k-1)/n), for n/k star
        System.out.println(N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the area of a star with `N` rays and `K` rays, and prints the result.
