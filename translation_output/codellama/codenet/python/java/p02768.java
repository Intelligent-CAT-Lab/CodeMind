<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;

        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt *= (n - i);
            cnt *= (i + 1);
            cnt %= MOD;
        }

        long X = (long) Math.pow(2, n) - 1;
        long A = cnt;
        long B = cnt;
        long ans = (X - A - B) % MOD;

        System.out.println(ans);
    }
}
```
This is the Java code equivalent to the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Math.pow()` method to calculate the power of 2. The `cnt` variable is used to store the result of the modular combination, and the `X`, `A`, and `B` variables are used to store the values of the expressions. Finally, the `ans` variable is used to store the result of the calculation, and it is printed to the console using `System.out.println()`.</s>
