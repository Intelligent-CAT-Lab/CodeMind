Below is the Python code translated to Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int X = Integer.parseInt(input[1]);
            
            System.out.println((N - gcd(N, X)) * 3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
```

Please note that this code snippet is meant to run with the standard input as you presented in the test case. The `gcd` function has been implemented using the `BigInteger` class's `gcd` method, as Java does not have a built-in `gcd` function for primitive types. The `gcd` method on `BigInteger` objects is a handy way to compute the greatest common divisor between two numbers.

Make sure to run this code within a class named `Main` or change the class name accordingly and use JDK 1.5 or higher.
