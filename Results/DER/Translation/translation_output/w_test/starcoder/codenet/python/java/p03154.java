<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
34


```
MOD = 10**9 + 7
list_size = 20000001

f_list = [1] * list_size
f_r_list = [1] * list_size

for i in range(list_size-1):
	f_list[i+1] = (f_list[i] * (i+1)) % MOD

f_r_list[-1] = pow(f_list[-1], MOD - 2, MOD)

for i in range(list_size-2, -1, -1):
	f_r_list[i] = (f_r_list[i+1] * (i+1)) % MOD

h, w, k = map(int, input().split())
ans = k * f_list[h+w] * f_r_list[h+w-k]
ans += (h+w) * k * (k+1) * f_list[h+w-1] * f_r_list[2] * f_r_list[h+w-k]
ans %= MOD
ans += h * w * f_list[h+w-2] * (k-1) * k * (k+1) * pow(3, MOD-2, MOD) * f_r_list[h+w-k]
ans %= MOD
print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        int list_size = 20000001;

        long[] f_list = new long[list_size];
        long[] f_r_list = new long[list_size];

        f_list[0] = 1;
        f_r_list[list_size-1] = 1;

        for (int i = 1; i < list_size; i++) {
            f_list[i] = (f_list[i-1] * i) % MOD;
        }

        f_r_list[list_size-1] = pow(f_list[list_size-1], MOD - 2, MOD);

        for (int i = list_size-2; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i+1] * (i+1)) % MOD;
        }

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        long ans = k * f_list[h+w] * f_r_list[h+w-k];
        ans += (h+w) * k * (k+1) * f_list[h+w-1] * f_r_list[2] * f_r_list[h+w-k];
        ans %= MOD;
        ans += h * w * f_list[h+w-2] * (k-1) * k * (k+1) * pow(3, MOD-2, MOD) * f_r_list[h+w-k];
        ans %= MOD;
        System.out.println(ans);
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }
}
```
'''
<|endoftext|>
