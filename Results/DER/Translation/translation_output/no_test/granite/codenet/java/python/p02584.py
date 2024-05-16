System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02584 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = Long.parseLong(scan.next());
        long k = Long.parseLong(scan.next());
        long d = Long.parseLong(scan.next());
        scan.close();

        long ans = 0;
        long absX = Math.abs(x);
        if (absX / d >= k) {
            ans = absX - k * d;
        } else {
            long sho = absX / d;
            long amari = absX % d;
            if ((k - sho) % 2 == 0) {
                ans = amari;
            } else {
                ans = d - amari;
            }
        }

        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

x, k, d = map(int, sys.stdin.readline().split())

ans = 0
absX = abs(x)
if absX // d >= k:
    ans = absX - k * d
else:
    sho = absX // d
    amari = absX % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```<|endoftext|>
