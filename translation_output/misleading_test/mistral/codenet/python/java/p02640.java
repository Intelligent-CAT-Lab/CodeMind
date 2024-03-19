<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8

Expected output:
mYes

```
x, y = map(int, input().split())
count = 0
for a in range(x+1):
    b = x - a
    if (2*a + 4*b) == y:
        count = 1
        break
    else:
        pass
print("Yes" if count == 1 else "No")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        int count = 0;
        for (int a = 1; a <= x; a++) {
            int b = x - a;
            if (2 * a + 4 * b == y) {
                count = 1;
                break;
            }
        }
        System.out.println("Yes" + (count == 1 ? "" : " No"));
    }
}
```</s>
