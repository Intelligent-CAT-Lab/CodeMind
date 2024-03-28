<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        BigInteger result = BigInteger.valueOf(n).factorial();
        result = result.mod(BigInteger.valueOf(1000000007));
        System.out.println(result);
    }
}
```</s>
