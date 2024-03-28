<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y != 0:
  x, y = y, x % y
print(y)

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
        if (x > y) {
            x = y;
            y = x;
        }
        while (x % y != 0) {
            x = y;
            y = x % y;
        }
        System.out.println(y);
    }
}
```</s>
