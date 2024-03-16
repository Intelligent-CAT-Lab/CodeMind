Below is the translated Java code equivalent to your provided Python code:

```java
import java.util.Scanner;

public class Main {

    // Calculate Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    // Calculate Least Common Multiple (LCM)
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        System.out.println(lcm(A, B));
        scanner.close();
    }
}
```

This Java program will output the least common multiple (LCM) of two numbers, provided as input in a single line separated by a space, in the same manner as the Python code. The `gcd` method is defined to calculate the greatest common divisor, which is then used in the `lcm` method to calculate the least common multiple. In the `main` method, input is taken from the user, processed, and the result of `lcm` is printed out.
