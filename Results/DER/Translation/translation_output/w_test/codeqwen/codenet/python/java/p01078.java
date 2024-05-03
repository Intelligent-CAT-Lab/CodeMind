Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double PI = 3.1415926535897932384626433832795;
        double area = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.printf("%.10f", area);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the area of a star using the formula provided in the Python code, and then prints the result to the standard output. The `printf` method is used to print the result with 10 decimal places.
