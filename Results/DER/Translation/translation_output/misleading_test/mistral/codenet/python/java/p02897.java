<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-15.97688597978339

```
N = int(input())
print(-(-N//2)/N)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double result = -(-N / 2.0) / N;
        System.out.println(result);
    }
}
```</s>
