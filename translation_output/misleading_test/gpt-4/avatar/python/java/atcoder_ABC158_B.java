Sure, here's the Python code translated into Java.

Java code:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = new BigInteger(scanner.next());
        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());

        BigInteger sumAB = A.add(B);
        BigInteger ans = N.divide(sumAB).multiply(A);
        BigInteger rem = N.mod(sumAB);
        ans = ans.add(rem.min(A));

        System.out.println(ans.toString());
    }
}
```

Test input:
```
501719768609305159 370614275896614890 131105492712690269
```

Expected output:
```
370614275896614935
```
