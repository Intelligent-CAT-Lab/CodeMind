<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = sc.nextInt();
        }
        int w = input[0];
        int h = input[1];
        int v = input[2];
        int t = input[3];
        int x = input[4];
        int y = input[5];
        int p = input[6];
        int q = input[7];
        int ans = 0;
        for (int a = p; a <= 2 * w - p; a++) {
            for (int b = q; b <= 2 * h - q; b++) {
                ans += count(a, b);
            }
        }
        System.out.println(ans);
    }

    public static int count(int a, int b) {
        int res = 0;
        int C = v * t;
        int ky = 0;
        while (1) {
            int B = b + 2 * h * ky;
            int D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky++;
        }
        ky = -1;
        while (1) {
            int B = b + 2 * h * ky;
            int D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky--;
        }
        return res;
    }
}
```</s>
