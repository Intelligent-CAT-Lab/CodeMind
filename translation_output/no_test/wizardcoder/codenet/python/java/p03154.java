Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        int list_size = 20000001;

        int[] f_list = new int[list_size];
        int[] f_r_list = new int[list_size];

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

        BigInteger ans = BigInteger.valueOf(k).multiply(BigInteger.valueOf(f_list[h+w])).multiply(BigInteger.valueOf(f_r_list[h+w-k]));
        ans = ans.add(BigInteger.valueOf(h+w).multiply(BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k+1)).multiply(BigInteger.valueOf(f_list[h+w-1])).multiply(BigInteger.valueOf(f_r_list[2])).multiply(BigInteger.valueOf(f_r_list[h+w-k])));
        ans = ans.mod(BigInteger.valueOf(MOD));
        ans = ans.add(BigInteger.valueOf(h).multiply(BigInteger.valueOf(w)).multiply(BigInteger.valueOf(f_list[h+w-2])).multiply(BigInteger.valueOf(k-1)).multiply(BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k+1)).multiply(pow(3, MOD-2, MOD)).multiply(BigInteger.valueOf(f_r_list[h+w-k])));
        ans = ans.mod(BigInteger.valueOf(MOD));

        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}
```<|endoftext|>
