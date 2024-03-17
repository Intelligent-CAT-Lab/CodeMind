Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        int list_size = 20000001;

        BigInteger[] f_list = new BigInteger[list_size];
        BigInteger[] f_r_list = new BigInteger[list_size];

        f_list[0] = BigInteger.ONE;
        f_r_list[list_size-1] = BigInteger.ONE;

        for (int i = 1; i < list_size; i++) {
            f_list[i] = f_list[i-1].multiply(BigInteger.valueOf(i+1)).mod(BigInteger.valueOf(MOD));
        }

        f_r_list[list_size-1] = f_list[list_size-1].modPow(BigInteger.valueOf(MOD-2), BigInteger.valueOf(MOD));

        for (int i = list_size-2; i >= 0; i--) {
            f_r_list[i] = f_r_list[i+1].multiply(BigInteger.valueOf(i+1)).mod(BigInteger.valueOf(MOD));
        }

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        BigInteger ans = BigInteger.valueOf(k).multiply(f_list[h+w]).multiply(f_r_list[h+w-k]).mod(BigInteger.valueOf(MOD));
        ans = ans.add(BigInteger.valueOf(h+w).multiply(BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k+1)).multiply(f_list[h+w-1]).multiply(f_r_list[2]).multiply(f_r_list[h+w-k]).mod(BigInteger.valueOf(MOD)));
        ans = ans.add(BigInteger.valueOf(h).multiply(BigInteger.valueOf(w)).multiply(f_list[h+w-2]).multiply(BigInteger.valueOf(k-1)).multiply(BigInteger.valueOf(k)).multiply(BigInteger.valueOf(k+1)).modPow(BigInteger.valueOf(3).subtract(BigInteger.valueOf(2)), BigInteger.valueOf(MOD)).multiply(f_r_list[h+w-k]).mod(BigInteger.valueOf(MOD)));
        System.out.println(ans);
    }
}
```<|endoftext|>
