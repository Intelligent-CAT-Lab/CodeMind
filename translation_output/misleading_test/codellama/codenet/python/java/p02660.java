<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
24

Expected output:
43

```
def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a

n = int(input())
res = prime_factorize(n)
if len(res) == 1:
  print(1)
else:
  cnt = 0
  c = None
  p = 0
  l = set()
  for r in res:
    if c == r:
      p += 1
      if not p in l:
        l.add(p)
        p = 0
        cnt += 1
    else:
      l.clear()
      p = 0
      l.add(1)
      cnt += 1
      c = r
  print(cnt)
```
[/INST]
```java
import java.util.Scanner;

public class PrimeFactorize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] factors = primeFactorize(n);
        int count = 0;
        int currentFactor = 0;
        int power = 0;
        Set<Integer> powers = new HashSet<>();
        for (int factor : factors) {
            if (currentFactor == factor) {
                power++;
                if (!powers.contains(power)) {
                    powers.add(power);
                    power = 0;
                    count++;
                }
            } else {
                powers.clear();
                power = 0;
                powers.add(1);
                count++;
                currentFactor = factor;
            }
        }
        System.out.println(count);
    }

    private static int[] primeFactorize(int n) {
        int[] factors = new int[n];
        int i = 0;
        while (n % 2 == 0) {
            factors[i++] = 2;
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors[i++] = f;
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            factors[i++] = n;
        }
        return factors;
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It first defines a `primeFactorize` method that takes an integer `n` as input and returns an array of its prime factors. The method uses a similar approach as the Python code, but it is written in Java. It then defines a `main` method that takes an integer `n` as input, calls the `primeFactorize` method to get the prime factors of `n`, and then counts the number of unique prime factors. Finally, it prints the result.

Note that this code assumes that the input integer `n` is positive. If `n` is negative, the code will not work correctly.</s>
