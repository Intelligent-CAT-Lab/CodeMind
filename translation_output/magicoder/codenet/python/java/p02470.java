<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> primes = primes(n);
        System.out.println(phiFunc(n, primes));
    }

    public static List<Integer> primes(int n) {
        int rn = (int) Math.sqrt(n);
        boolean[] sieve = new boolean[rn + 1];
        Arrays.fill(sieve, true);
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                int j = i * 2;
                while (j <= rn) {
                    sieve[j] = false;
                    j += i;
                }
            }
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 2; i <= rn; i++) {
            if (sieve[i]) {
                p.add(i);
            }
        }
        return p;
    }

    public static int phiFunc(int n, List<Integer> p) {
        int ans = n;
        for (int q : p) {
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

This Java code does the same thing as the Python code. It first calculates all prime numbers up to the square root of the input number, then calculates the Euler's totient function for the input number using these prime numbers.<｜end▁of▁sentence｜>
