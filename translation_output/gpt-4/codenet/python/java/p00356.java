Here's the equivalent Java code wrapped between the ```java``` tags:

```java
import java.util.Scanner;

public class SumMinusGCDPlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(a + b - gcd(a, b) + 1);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

The `math.gcd` function in Python calculates the greatest common divisor (GCD) of the two numbers, and we replicate that with a private `gcd` method in our Java class. Java standard library from JDK 1.8 onwards provides the GCD method in the `java.math.BigInteger` class, but above, I have implemented it manually so you can see the equivalent logic.

Make sure when you run the Java program, you have some mechanism to provide input to the program as Java does not inherently support tuple assignment or the `split` function for input parsing like Python. Instead, we use a `Scanner` to read the integers.
