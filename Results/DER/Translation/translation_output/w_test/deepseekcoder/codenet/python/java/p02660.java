<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> res = primeFactorize(n);
        if (res.size() == 1) {
            System.out.println(1);
        } else {
            System.out.println(countDistinctPrimeFactors(res));
        }
    }

    private static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }

    private static int countDistinctPrimeFactors(List<Integer> res) {
        int cnt = 0;
        Integer c = null;
        int p = 0;
        Set<Integer> l = new HashSet<>();
        for (Integer r : res) {
            if (c == r) {
                p += 1;
                if (!l.contains(p)) {
                    l.add(p);
                    p = 0;
                    cnt += 1;
                }
            } else {
                l.clear();
                p = 0;
                l.add(1);
                cnt += 1;
                c = r;
            }
        }
        return cnt;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, factorizes it into prime numbers, and then counts the number of distinct prime factors. The result is printed to the standard output.
<|EOT|>
