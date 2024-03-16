<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
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
                int res = 0;
                int C = v*t;
                int ky = 0;
                while (true) {
                    int B = b + 2*h*ky;
                    double D = C*C - (B - y)*(B - y);
                    if (D < 0) {
                        break;
                    }
                    double SQ = Math.sqrt(D) + 1e-7;
                    int k0 = (int)((x - a - SQ) / (2*w));
                    int k1 = (int)((x - a + SQ) / (2*w));
                    res += Math.max(k1 - k0, 0);
                    ky += 1;
                }
                ky = -1;
                while (true) {
                    int B = b + 2*h*ky;
                    double D = C*C - (B - y)*(B - y);
                    if (D < 0) {
                        break;
                    }
                    double SQ = Math.sqrt(D) + 1e-7;
                    int k0 = (int)((x - a - SQ) / (2*w));
                    int k1 = (int)((x - a + SQ) / (2*w));
                    res += Math.max(k1 - k0, 0);
                    ky -= 1;
                }
                ans += res;
            }
        }
        System.out.println(ans);
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The code is similar to the Python code, with some minor differences in syntax and naming conventions.</s>
