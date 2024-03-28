<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-68

```
n, m = map(int, input().split())
if n == 1 or m == 1:
    print(1 if n * m == 1 else max(n, m) - 2)
else:
    print((n - 2) * (m - 2))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 1 || m == 1) {
            System.out.println(n * m == 1 ? 1 : Math.max(n, m) - 2);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```</s>
