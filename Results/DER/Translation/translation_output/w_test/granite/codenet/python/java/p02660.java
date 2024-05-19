System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
24

Expected output:
3


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
    if n!= 1:
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


Answer:
```java
import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> factors = primeFactorize(n);
        if (factors.size() == 1) {
            System.out.println(1);
        } else {
            int count = 0;
            Integer currentFactor = null;
            int power = 0;
            Set<Integer> powers = new HashSet<>();
            for (int factor : factors) {
                if (currentFactor == null || currentFactor.equals(factor)) {
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
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n!= 1) {
            factors.add(n);
        }
        return factors;
    }
}
```<|endoftext|>
