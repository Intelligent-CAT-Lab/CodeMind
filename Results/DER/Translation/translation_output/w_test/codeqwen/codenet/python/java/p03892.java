Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(gcd(Math.abs(b - d), Math.abs(c - a)));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the absolute difference between the second and fourth integers, and the absolute difference between the third and first integers. It then calls the `gcd` function to find the greatest common divisor of these two numbers. The result is printed to the console.
