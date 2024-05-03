Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        long lcm = lcm(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static long gcd(long a, long b) {
        while (a % b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
```

This Java code does the same thing as your Python code. It reads the input from the user, calculates the LCM of the two numbers, and then prints the result. The `gcd` and `lcm` methods are defined to calculate the Greatest Common Divisor and Least Common Multiple of two numbers, respectively.
