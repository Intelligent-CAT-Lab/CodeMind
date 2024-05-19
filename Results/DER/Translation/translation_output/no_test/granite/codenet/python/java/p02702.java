System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s = input()

remain = [0]*2020
now = 0
ans = 0
for i in range(len(s)-1, -1, -1):
    now += int(s[i])*pow(10, len(s)-i-1, 2019)
    ans += remain[now%2019]
    remain[now%2019] += 1

ans += remain[0]

print(ans)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] remain = new int[2019];
        int now = 0;
        long ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now = (now + Integer.parseInt(String.valueOf(s.charAt(i))) * (int) Math.pow(10, s.length() - i - 1) % 2019) % 2019;
            ans += remain[now];
            remain[now]++;
        }
        ans += remain[0];
        System.out.println(ans);
    }
}
```<|endoftext|>
