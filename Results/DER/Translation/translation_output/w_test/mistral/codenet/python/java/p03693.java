<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YES


```
r, g, b = map(int, input().split())

if (g * 10 + b) % 4 == 0:
    print("YES")
else:
    print("NO")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, g, b;
        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();
        if (g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
