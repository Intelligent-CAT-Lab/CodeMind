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
        int lcm = lcm(x, y);
        System.out.println((b / lcm) - ((a - 1) / lcm));
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the LCM of the first two integers, and then prints the result of the expression `b // lcm - ( a - 1 ) // lcm`. The `gcd` method is used to calculate the greatest common divisor of two integers, and the `lcm` method is used to calculate the least common multiple of two integers.
