<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

mod = 10**9+7
rng = 2000100
fctr = [1]+[0]*(rng-1)
for i in range(1,rng):
  fctr[i] = fctr[i-1]*i%mod
def finv(x):
  return pow(fctr[x],mod-2,mod)
def cmb(n,k):
  if n<0 or k<0:
    return 0
  else:
    return fctr[n]*finv(n-k)*finv(k)%mod

x1,y1,x2,y2 = map(int,input().split())
print((cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        int rng = 2000100;
        int[] fctr = new int[rng];
        fctr[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod;
        System.out.println(result);
    }

    public static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv(n - k) * finv(k) % mod;
        }
    }

    public static int finv(int x) {
        return (int) Math.pow(fctr[x], mod - 2) % mod;
    }
}
```
This is the Java code equivalent to the Python code you provided. It uses the same algorithm and data structures, but with Java syntax.

Note that I had to make a few changes to the Python code to make it work in Java. For example, I had to use `Math.pow()` instead of `**` to raise numbers to a power, and I had to cast the result of `Math.pow()` to an `int` to match the type of the `fctr` array.</s>
