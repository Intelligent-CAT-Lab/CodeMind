<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math


def combination(i: int, j: int) -> int:
    return math.factorial(i) // math.factorial(i - j) // math.factorial(j)


if __name__ == "__main__":
    n, k = map(lambda x: int(x), input().split())
    modulo = 10 ** 9 + 7
    ans = 0
    if k <= n:
        for i in range(k):
            if 0 == i % 2:
                ans += (k - i) ** n * combination(k, i)
            else:
                ans -= (k - i) ** n * combination(k, i)
        ans = ans % modulo

    print(ans)



Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.math.BigInteger;

public class Combination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger modulo = BigInteger.valueOf(1000000007);
        BigInteger ans = BigInteger.ZERO;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans = ans.add(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                } else {
                    ans = ans.subtract(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                }
            }
            ans = ans.mod(modulo);
        }
        System.out.println(ans);
    }

    public static BigInteger combination(int i, int j) {
        BigInteger result = BigInteger.ONE;
        for (int k = 1; k <= j; k++) {
            result = result.multiply(BigInteger.valueOf(i - k + 1)).divide(BigInteger.valueOf(k));
        }
        return result;
    }
}

This is the Java code for the above Python code. The code uses the `BigInteger` class to handle large numbers and the `Scanner` class to read input from the user. The `combination` function is implemented using the formula for the binomial coefficient, and the `main` function uses this function to calculate the answer. The code also includes a modulo operation to ensure that the answer is within the desired range.</s>
