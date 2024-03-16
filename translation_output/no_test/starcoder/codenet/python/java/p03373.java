<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        if (2 * c <= a + b) {
            ans += Math.min(x, y) * 2 * c;
            int q = Math.min(x, y);
            x -= q;
            y -= q;
            if (x > 0 && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x > 0) {
                ans += a * x;
            } else if (y > 0 && 2 * c <= b) {
                ans += 2 * c * y;
            } else if (y > 0) {
                ans += b * y;
            }
        } else {
            ans = x * a + y * b;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
