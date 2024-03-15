<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from sys import stdin, stdout


a, b, c, x, y = map(int, stdin.readline().split())

ans = 0
if 2 * c <= a + b:
    ans += min(x, y) * 2 * c
    q = min(x, y)
    x -= q
    y -= q
    
    if x and 2 * c <= a:
        ans += 2 * c * x
    elif x:
        ans += a * x
    elif y and 2 * c <= b:
        ans += 2 * c * y
    else:
        ans += b * y
    
else:
    ans = x * a + y * b

stdout.write(str(ans))
```

### 解答

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int ans = 0;
        if (2 * c <= a + b) {
            ans += Math.min(x, y) * 2 * c;
            int q = Math.min(x, y);
            x -= q;
            y -= q;
            if (x && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x) {
                ans += a * x;
            } else if (y && 2 * c <= b) {
                ans += 2 * c * y;
            } else {
                ans += b * y;
            }
        } else {
            ans = x * a + y * b;
        }
        System.out.println(ans);
    }
}
```
</s>
