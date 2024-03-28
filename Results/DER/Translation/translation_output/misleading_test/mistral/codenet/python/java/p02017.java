<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 1 4

Expected output:
\o

```
H, W, X, Y = map(int, input().split())

if ((H * W) * (X + Y)) % 2:
    print('No')
else:
    print('Yes')

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if ((H * W) * (X + Y)) % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
