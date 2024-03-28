<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger ans = BigInteger.ZERO;
        if (k % 2 == 1) {
            ans = BigInteger.valueOf(n / k).pow(3);
        } else {
            ans = BigInteger.valueOf(n / k).pow(3) + BigInteger.valueOf((n + k / 2) / k).pow(3);
        }
        System.out.println(ans);
    }
}

Note: The above code uses the `BigInteger` class from the `java.math` package to handle large numbers.</s>
