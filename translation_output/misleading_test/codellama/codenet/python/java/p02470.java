<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
38

```
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

```
[/INST]
```java
import java.util.Scanner;

public class EulerPhiFunction {

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
```
This code uses the Sieve of Eratosthenes to find all the prime numbers up to the square root of the input number, and then uses the Euler's totient function to calculate the number of positive integers less than or equal to n that are relatively prime to n.

The `getPrimes` method uses the Sieve of Eratosthenes to find all the prime numbers up to the square root of the input number, and returns an array of these prime numbers.

The `phiFunction` method takes an integer n and an array of prime numbers as input, and calculates the Euler's totient function of n using the given prime numbers. It returns the result of the calculation.

The `main` method reads an integer from the user, calls the `getPrimes` method to get an array of prime numbers up to the square root of the input number, and then calls the `phiFunction` method to calculate the Euler's totient function of the input number using the given prime numbers. Finally, it prints the result to the console.</s>
