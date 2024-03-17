<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 0 0 3 3

Expected output:
2


```
from math import factorial
def comb (x,y):
	return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, ax, ay, bx, by;
        w = sc.nextInt();
        h = sc.nextInt();
        ax = sc.nextInt();
        ay = sc.nextInt();
        bx = sc.nextInt();
        by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        int ans = 1;
        if (dx * 2 == w) {
            ans *= 2;
        }
        if (dy * 2 == h) {
            ans *= 2;
        }
        ans *= factorial(dx + dy) / factorial(dx) / factorial(dy);
        System.out.println(ans % 100000007);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```</s>
