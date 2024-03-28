<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 1

Expected output:
6


```
N, H, D = map(int,input().split())
MOD = 10**9 + 7
 
fact = [1]
fact_cum = [0]
for i in range(1,N+1):
  fact.append((fact[-1]*i)%MOD)
  fact_cum.append((fact_cum[-1] + fact[-1])%MOD)
 
ap = [0] * (H+1)
ap_cum = [0] * (H+1)
ap[0] = 1
ap_cum[0] = 1
 
for n in range(1,H+1):
  x = ap_cum[n-1]
  if n > D:
    x -=ap_cum[n-D-1]
  x *= fact_cum[N]
  x %= MOD
  ap[n] = x
  ap_cum[n] = (ap_cum[n-1] + x)%MOD
 
 
ans = ap[H]
ans *= fact[N]
ans %= MOD
ans *= pow(fact_cum[N],MOD-2,MOD)
ans %= MOD
 
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int D = scanner.nextInt();
        int MOD = 1000000007;

        int[] fact = new int[N + 1];
        int[] fact_cum = new int[N + 1];
        fact[0] = 1;
        fact_cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            fact_cum[i] = (fact_cum[i - 1] + fact[i]) % MOD;
        }

        int[] ap = new int[H + 1];
        int[] ap_cum = new int[H + 1];
        ap[0] = 1;
        ap_cum[0] = 1;
        for (int n = 1; n <= H; n++) {
            int x = ap_cum[n - 1];
            if (n > D) {
                x -= ap_cum[n - D - 1];
            }
            x = (x * fact_cum[N]) % MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n - 1] + x) % MOD;
        }

        int ans = ap[H];
        ans = (ans * fact[N]) % MOD;
        ans = (ans * pow(fact_cum[N], MOD - 2, MOD)) % MOD;

        System.out.println(ans);
    }

    public static int pow(int a, int b, int MOD) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return result;
    }
}
```
Note: The `pow` method is a helper method to calculate the power of a number modulo `MOD`. It is not a built-in method in Java.</s>
