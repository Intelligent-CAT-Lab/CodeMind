<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 2 4

Expected output:
12

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
[/INST]
```python
import sys

def main():
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

if __name__ == "__main__":
    main()
```</s>
