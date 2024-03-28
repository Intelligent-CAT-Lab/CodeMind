<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


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
        BigInteger result = BigInteger.ONE.multiply(BigInteger.valueOf(2).pow(n)).mod(BigInteger.valueOf(1000000007));
        System.out.println(result);
    }
}
```</s>
