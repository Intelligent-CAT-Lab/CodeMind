<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Ye

```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        if (500 * K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
