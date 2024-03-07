<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from math import gcd
K = int(input())
ans = 0

for a in range(1, K+1):
    for b in range(1, K+1):
        for c in range(1, K+1):
            ans += gcd(gcd(a, b), c)

print(ans)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += gcd(gcd(a, b), c);
                }
            }
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
This is the Java code equivalent to the Python code. It uses the same logic to calculate the greatest common divisor (GCD) of three numbers, and then calculates the sum of the GCDs for all possible combinations of three numbers between 1 and K. The `gcd` method is defined separately to avoid code duplication.</s>
