<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-68

```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```
[/INST]
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger result = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n - 1)).multiply(BigInteger.valueOf(n - 2)).multiply(BigInteger.valueOf(n - 3)).multiply(BigInteger.valueOf(n - 4)).multiply(BigInteger.valueOf(n - 5)).multiply(BigInteger.valueOf(n - 6)).multiply(BigInteger.valueOf(n - 7)).multiply(BigInteger.valueOf(n - 8)).multiply(BigInteger.valueOf(n - 9)).multiply(BigInteger.valueOf(n - 10));
        result = result.mod(BigInteger.valueOf(1000000007));
        System.out.println(result);
    }
}
```</s>
