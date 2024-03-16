```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        BigInteger mod = BigInteger.TEN.pow(9).add(BigInteger.valueOf(7));
        BigInteger result = factorial.mod(mod);
        
        System.out.println(result);
    }
}
```
