Below is the translation of the given Python code into Java. We'll create a `Combination` class with a `combination` method to calculate the combinations like in the Python example, and a `main` method to process the test case inputs and compute the expected output.

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Combination {
  
    private static BigInteger combination(int i, int j) {
        return factorial(i).divide(factorial(i - j).multiply(factorial(j)));
    }

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        BigInteger modulo = BigInteger.valueOf((long) 1e9 + 7);
        BigInteger ans = BigInteger.ZERO;

        if (k <= n) {
            for (int i = 0; i < k; i++) {
                BigInteger term = BigInteger.valueOf(k - i).pow(n)
                                 .multiply(combination(k, i));
                
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

Please take note that in Java, imported modules and their respective classes are strictly typed. The BigInteger class is used here because the factorial of large numbers quickly exceeds the capacity of standard integer datatypes. Additionally, we use the Scanner class to handle input parsing.
