<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MOD = 1000000007;
        int listSize = 200000001;

        int[] fList = new int[listSize];
        int[] fRList = new int[listSize];

        for (int i = 0; i < listSize; i++) {
            fList[i] = 1;
            fRList[i] = 1;
        }

        for (int i = 0; i < listSize - 1; i++) {
            fList[i + 1] = (fList[i] * (i + 1)) % MOD;
        }

        fRList[listSize - 1] = pow(fList[listSize - 1], MOD - 2, MOD);

        for (int i = listSize - 2; i >= 0; i--) {
            fRList[i] = (fRList[i + 1] * (i + 1)) % MOD;
        }

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = k * fList[h + w] * fRList[h + w - k];
        ans += (h + w) * k * (k + 1) * fList[h + w - 1] * fRList[2] * fRList[h + w - k];
        ans %= MOD;
        ans += h * w * fList[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * fRList[h + w - k];
        ans %= MOD;

        System.out.println(ans);
    }

    public static int pow(int base, int exponent, int modulus) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % modulus;
        }
        return result;
    }
}
```
This is the Java code for the given Python code. It uses the same algorithm and data structures as the Python code, but it is written in Java. The `pow` function is used to compute the modular exponentiation, which is the same as the `pow` function in Python. The rest of the code is similar to the Python code, with some minor changes to make it compatible with Java.</s>
