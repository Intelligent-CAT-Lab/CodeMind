<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3 2 1

Expected output:
2


```
n, a, b, c = map(int, input().split())
print(n-(c+a-c+b-c))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b, c;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int result = n - (c + a - c + b - c);
        System.out.println(result);
    }
}
```</s>
