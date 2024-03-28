Below is the translated Java code for the given Python program:

```java
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    private static final int MOD = 998244353;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        String[] tokens = reader.readLine().split(" ");
        int p = Integer.parseInt(tokens[0]);
        int q = Integer.parseInt(tokens[1]);
        
        int g = gcd(p, q);
        int t = q / g;
        int k = 1;
        
        if (t % 2 == 0) {
            k *= 2;
            while (t % 2 == 0) {
                t /= 2;
            }
        }
        
        for (int i = 3; i <= Math.sqrt(t) + 1; i += 2) {
            if (t % i > 0) {
                continue;
            }
            k *= i;
            while (t % i == 0) {
                t /= i;
            }
        }
        
        writer.println(t * k);
        writer.flush();
    }
    
    public static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
```

To run this program, you should have Java installed on your machine. You can compile the Java code using `javac Main.java` and then run it with `java Main`. Make sure to use the correct file name if you save the code to a file with a different name.

Keep in mind that you must provide the input directly in the command line, redirect it from a file, or modify the code to read from a file because Java does not have the same command-line input facilities as Python.

This Java code uses the `BigInteger` class for the `gcd` method to ensure that it can handle large integer values correctly, just as the Python program uses `fractions.gcd` (although in Python 3.5 and later, `math.gcd` should be used as `fractions.gcd` is deprecated).

Also, note that Java's `BufferedReader` is being used here for input reading instead of `sys.stdin`, and `PrintWriter` for output instead of `sys.stdout`.
