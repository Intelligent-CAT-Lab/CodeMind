System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 1 3

Expected output:
2


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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        ans += 1 * Math.min(a, k);
        k -= Math.min(a, k);
        ans += 0 * Math.min(b, k);
        k -= Math.min(b, k);
        ans += -1 * Math.min(c, k);
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```

Test input:
2 1 1 3

Expected output:
2<|endoftext|>
