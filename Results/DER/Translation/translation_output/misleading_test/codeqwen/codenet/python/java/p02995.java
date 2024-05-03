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
        System.out.println(main(a, b, c, d));
    }

    public static int main(int a, int b, int c, int d) {
        int lcm = c * d / gcd(c, d);
        return b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the least common multiple (LCM) of the two last integers, and then calculates the number of integers between the first and second integers that are not divisible by either of the last two integers or the LCM. The result is then printed to the console.
