Below is the translated Java code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        // Calculate the result using the main logic
        long ans = main(a, b, c, d);
        
        // Print the result
        System.out.println(ans);
    }

    public static int[] readInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        return new int[]{a, b, c, d};
    }
    
    public static long main(int a, int b, int c, int d) {
        long lcm = lcm(c, d);
        return (b - a + 1) - (divide(b, c) - divide(a - 1, c) + divide(b, d) - divide(a - 1, d) - (divide(b, lcm) - divide(a - 1, lcm)));
    }
    
    private static long lcm(int x, int y) {
        return ((long) x * y) / gcd(x, y);
    }
    
    private static long gcd(int x, int y) {
        BigInteger bigX = BigInteger.valueOf(x);
        BigInteger bigY = BigInteger.valueOf(y);
        return bigX.gcd(bigY).longValue();
    }
    
    private static long divide(int x, int y) {
        return x / y;
    }
}
```

In this Java version of the code, the functionalities of reading inputs, the `main` logic, the least common multiple (`lcm`), and the greatest common divisor (`gcd`) are implemented using separate methods.

Note that in Java, there isn't a built-in method for gcd and lcm, so we use `BigInteger`'s `gcd` method for calculating the greatest common divisor, and calculate the lcm by dividing the product of the two numbers by their gcd. Also, I retained the `readInput()` method signature, even though it's not being used in `main()`, to reflect the structure of the Python code. Java uses `Scanner` to read from standard input.
