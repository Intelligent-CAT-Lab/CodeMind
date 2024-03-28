<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1.000

Expected output:
2.000000000000


```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = n / 1 + 1;
        if (Math.pow(2, 0.5) * n < result) {
            result = Math.pow(2, 0.5) * n;
        }
        System.out.printf("%.16f", result);
    }
}
```</s>
