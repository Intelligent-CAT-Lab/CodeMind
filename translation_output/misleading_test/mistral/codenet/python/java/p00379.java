<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
16 2 1000

Expected output:
9

```
a, n, m = map(int, input().split())
ans = 0
for y in range(1, 50):
    x = (y + a)**n
    if 1 <= x <= m and y == sum(map(int, str(x))):
        ans += 1
print(ans)

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n, m;
        String input = sc.nextLine();
        String[] split = input.split(" ");
        a = Integer.parseInt(split[0]);
        n = Integer.parseInt(split[1]);
        m = Integer.parseInt(split[2]);
        int ans = 0;
        for (int y = 1; y < 50; y++) {
            int x = (y + a) * Math.pow(2, n);
            if (x <= m && y == Integer.parseInt(Integer.toString(x))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```</s>
