<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c, k = map(int, input().split())
ans = 0
ans += 1*( min(a, k) )
k -= min(a, k)
ans += 0*( min(b, k) )
k -= min(b, k)
ans += (-1)*( min(c, k) )
k -= min(c, k)
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, k;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        k = scanner.nextInt();
        int ans = 0;
        ans += 1 * (Math.min(a, k));
        k -= Math.min(a, k);
        ans += 0 * (Math.min(b, k));
        k -= Math.min(b, k);
        ans += (-1) * (Math.min(c, k));
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```</s>
