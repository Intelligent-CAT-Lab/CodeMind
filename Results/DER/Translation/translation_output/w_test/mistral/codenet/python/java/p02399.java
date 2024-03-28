<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1 1 1.50000


```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result1 = (double) a / b;
        double result2 = (double) a % b;
        double result3 = (double) a / b;
        System.out.printf("%d %d %f%n", result1, result2, result3);
    }
}
```</s>
