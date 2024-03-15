<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, k = map(int, input().split())
if a <= k:
    k -= a
    a = 0
else:
    print(a - k, b)
    exit()
print(0, max(b - k, 0))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, k;
        a = scanner.nextInt();
        b = scanner.nextInt();
        k = scanner.nextInt();
        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k);
            System.exit(0);
        }
        System.out.println(0, Math.max(b - k, 0));
    }
}
```</s>
