<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        for (int a : new int[]{p, 2*w-p}) {
            for (int b : new int[]{q, 2*h-q}) {
                ans += count(w, h, v, t, x, y, a, b);
            }
        }
        System.out.println(ans);
    }

    private static int count(int w, int h, int v, int t, int x, int y, int a, int b) {
        int res = 0;
        int C = v*t;
        int ky = 0;
        while (true) {
            int B = b + 2*h*ky;
            double D = Math.pow(C, 2) - Math.pow(B - y, 2);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) Math.floor((x - a - SQ) / (2*w));
            int k1 = (int) Math.floor((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky += 1;
        }
        ky = -1;
        while (true) {
            int B = b + 2*h*ky;
            double D = Math.pow(C, 2) - Math.pow(B - y, 2);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) Math.floor((x - a - SQ) / (2*w));
            int k1 = (int) Math.floor((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky -= 1;
        }
        return res;
    }
}
```
<|EOT|>
