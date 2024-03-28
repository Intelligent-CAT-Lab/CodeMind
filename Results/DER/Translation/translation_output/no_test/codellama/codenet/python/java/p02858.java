<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from fractions import gcd
H,W,T=map(int, input().split())
gh, gw = gcd(H, T), gcd(W, T)
h, w = H // gh, W // gw
MOD = 1000000007
print(pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.close();

        int gh = gcd(H, T);
        int gw = gcd(W, T);
        int h = H / gh;
        int w = W / gw;
        int MOD = 1000000007;

        BigInteger result = BigInteger.valueOf(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3);
        result = result.modPow(gh * gw, MOD);

        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int pow(int base, int exponent, int mod) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % mod;
        }
        return result;
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read the input from the user, and the `BigInteger` class to perform the calculations. The `gcd` function is defined separately, and the `pow` function is defined as a helper method to perform the modular exponentiation. The `MOD` constant is defined as 1000000007, which is the modulus used in the Python code.</s>
