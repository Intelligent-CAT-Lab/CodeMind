<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 1 3

Expected output:
-83

```
n,a,b = map(int, input().split())
MOD = 10**9 + 7

def modcomb(n,a,mod):
    cnt = 1
    for i in range(a):
        cnt *= (n-i)
        cnt *= pow(i+1,mod-2,mod)
        cnt %= mod
    # print(cnt)
    return cnt
    


X = pow(2,n,MOD)-1
A = modcomb(n,a,MOD)
B = modcomb(n,b,MOD)
ans = (X-A-B)%MOD
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;

        long X = (long) Math.pow(2, n) - 1;
        long A = modcomb(n, a, MOD);
        long B = modcomb(n, b, MOD);
        long ans = (X - A - B) % MOD;
        System.out.println(ans);
    }

    public static long modcomb(int n, int a, int MOD) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= (long) Math.pow(i + 1, MOD - 2);
            cnt %= MOD;
        }
        return cnt;
    }
}
```
This is the Java code for the given Python code. The `modcomb` function is implemented using the same logic as the Python code, but with some minor changes to make it compatible with Java. The `main` function reads the input from the user and calls the `modcomb` function to calculate the result. The result is then printed to the console.</s>
