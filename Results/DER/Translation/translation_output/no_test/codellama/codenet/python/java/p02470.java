<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math

def primes(n):
    rn = int(math.sqrt(n))
    sieve = [1] * (rn + 1)
    for i in range(2, rn + 1):
        j = i * 2
        while j <= rn:
            sieve[j] = 0
            j += i
    p = [i for i in range(2, rn + 1) if sieve[i] == 1]
    return p

def phi_func(n, p):
    ans = n
    for q in p:
        if n % q == 0:
            ans = ans * (q - 1) // q
            while n % q == 0:
                n //= q
    else:
        if n > 1:
            ans = ans * (n - 1) // n
    return ans

line = input()
n = int(line)
p = primes(n)
print(phi_func(n, p))


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;

public class PhiFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] primes = getPrimes(n);
        int phi = phiFunction(n, primes);
        System.out.println(phi);
    }

    private static int[] getPrimes(int n) {
        int rn = (int) Math.sqrt(n);
        boolean[] sieve = new boolean[rn + 1];
        for (int i = 2; i <= rn; i++) {
            sieve[i] = true;
        }
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                for (int j = i * 2; j <= rn; j += i) {
                    sieve[j] = false;
                }
            }
        }
        int[] primes = new int[rn + 1];
        int count = 0;
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                primes[count++] = i;
            }
        }
        return primes;
    }

    private static int phiFunction(int n, int[] primes) {
        int ans = n;
        for (int q : primes) {
            if (n % q == 0) {
                ans = ans * (q - 1) / q;
                while (n % q == 0) {
                    n /= q;
                }
            }
        }
        if (n > 1) {
            ans = ans * (n - 1) / n;
        }
        return ans;
    }
}

This is the Java code for the above Python code. The code uses the same algorithm as the Python code, but it is written in Java. The code uses the `Scanner` class to read input from the user, and it uses the `Math` class to calculate the square root of the input number. The code also uses arrays to store the primes and the phi function values.</s>
