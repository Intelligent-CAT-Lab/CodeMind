<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
-22

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int k = scanner.nextInt();
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
This is the Java code for the given Python code. The code uses the `Scanner` class to read input from the user, and the `pow` method to calculate the power of a number modulo a modulus. The `fList` and `fRList` arrays are used to store the values of the factorials and their reciprocals, respectively. The `ans` variable is used to store the final result, which is calculated using the formula given in the problem statement. Finally, the `System.out.println` method is used to print the result.</s>
