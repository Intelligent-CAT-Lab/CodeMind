<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
130038

```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 100000;
        for (int i = 0; i < scanner.nextInt(); i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println(ans);
    }
}
```</s>
