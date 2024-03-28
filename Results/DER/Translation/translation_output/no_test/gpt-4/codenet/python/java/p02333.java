Here is the translated Java code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class CombinationCalculator {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger combination(int i, int j) {
        return factorial(i).divide(factorial(i - j)).divide(factorial(j));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        BigInteger modulo = BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7));
        BigInteger ans = BigInteger.ZERO;

        if (k <= n) {
            for (int i = 0; i < k; i++) {
                BigInteger term = BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i));
                if (i % 2 == 0) {
                    ans = ans.add(term);
                } else {
                    ans = ans.subtract(term);
                }
            }
            ans = ans.mod(modulo);
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

A few notes about the translation:
- Since Java doesn't have a built-in factorial function, I created a small `factorial` method using `BigInteger` to handle potential integer overflow for large values of `n`.
- For the combination calculation, I used `BigInteger` methods for arithmetic to remain consistent with the factorial calculation and avoid overflow.
- Java doesn't support default parameters or optional type hints, so those parts were omitted.
- I've added input parsing from the `Scanner` class, splitting the input line and converting it to integers.
- Due to Java's type system, we have to use `parseInt` when reading integer values from a string and `BigInteger` for large integer arithmetic.
- All arithmetic operations on `BigInteger` instances (`add`, `subtract`, `multiply`, `divide`, `mod`, `pow`) are methods rather than operators.
- At the end of the main method, I close the scanner to avoid resource leaks, as is good practice in Java.
