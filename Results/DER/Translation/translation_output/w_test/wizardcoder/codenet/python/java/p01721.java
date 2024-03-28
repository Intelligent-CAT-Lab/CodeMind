Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 1 10 3 3 7 7

Expected output:
1


```
def solve():
    w, h, v, t, x, y, p, q = map(int, input().split())
    def count(a, b):
        res = 0
        C = v*t
        ky = 0
        while 1:
            B = b + 2*h*ky
            D = C**2 - (B - y)**2
            if D < 0:
                break
            SQ = D**.5 + 1e-7
            k0 = int((x - a - SQ) // (2*w))
            k1 = int((x - a + SQ) // (2*w))
            res += max(k1 - k0, 0)
            ky += 1
        ky = -1
        while 1:
            B = b + 2*h*ky
            D = C**2 - (B - y)**2
            if D < 0:
                break
            SQ = D**.5 + 1e-7
            k0 = int((x - a - SQ) // (2*w))
            k1 = int((x - a + SQ) // (2*w))
            res += max(k1 - k0, 0)
            ky -= 1
        return res
    ans = 0
    for a in [p, 2*w-p]:
        for b in [q, 2*h-q]:
            ans += count(a, b)
    print(ans)
solve()

```

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int ans = 0;
        for (int a = p; a <= 2*w-p; a++) {
            for (int b = q; b <= 2*h-q; b++) {
                int C = v*t;
                int ky = 0;
                while (true) {
                    int B = b + 2*h*ky;
                    double D = Math.pow(C, 2) - Math.pow(B - y, 2);
                    if (D < 0) break;
                    double SQ = Math.sqrt(D) + 1e-7;
                    int k0 = (int) Math.floor((x - a - SQ) / (2*w));
                    int k1 = (int) Math.ceil((x - a + SQ) / (2*w));
                    ans += Math.max(k1 - k0, 0);
                    ky++;
                }
                ky = -1;
                while (true) {
                    int B = b + 2*h*ky;
                    double D = Math.pow(C, 2) - Math.pow(B - y, 2);
                    if (D < 0) break;
                    double SQ = Math.sqrt(D) + 1e-7;
                    int k0 = (int) Math.floor((x - a - SQ) / (2*w));
                    int k1 = (int) Math.ceil((x - a + SQ) / (2*w));
                    ans += Math.max(k1 - k0, 0);
                    ky--;
                }
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
