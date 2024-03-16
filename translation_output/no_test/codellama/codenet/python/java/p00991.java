<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();

        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        int ans = 1;
        if (dx * 2 == w) {
            ans *= 2;
        }
        if (dy * 2 == h) {
            ans *= 2;
        }
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }

    public static int comb(int x, int y) {
        return factorial(x) / factorial(x - y) / factorial(y);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the same logic and the same variables, but it is written in Java.

Note that I had to add the `factorial` and `comb` methods to the code, as they were not defined in the Python code.</s>
