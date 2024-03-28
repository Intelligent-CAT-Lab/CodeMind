<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
25


```
A, B = map(int, input().split())
f = False
ans = 0
n = A * 100 // 8
m = (A + 1) * 100 // 8
for i in range(n, m + 1):
  if i * 8 // 100 == A and i // 10 == B:
    f = True
    ans = i
    break
print(ans if f else -1)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = A * 100;
        int m = (A + 1) * 100;
        for (int i = n; i <= m; i++) {
            if (i % 8 == A && i / 10 == B) {
                System.out.println(i);
                break;
            }
        }
    }
}
```</s>
