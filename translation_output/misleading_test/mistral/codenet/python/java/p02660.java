<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
import java.util.*;

public class PrimeFactorize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> res = primeFactorize(n);
        if (res.size() == 1) {
            System.out.println(1);
        } else {
            int cnt = 0;
            int c = 0;
            int p = 0;
            Set<Integer> l = new HashSet<>();
            for (int r : res) {
                if (c == r) {
                    p++;
                    if (!l.contains(p)) {
                        l.add(p);
                        p = 0;
                        cnt++;
                    }
                } else {
                    l.clear();
                    p = 0;
                    l.add(1);
                    cnt++;
                    c = r;
                }
            }
            System.out.println(cnt);
        }
    }

    public static List<Integer> primeFactorize(int n) {
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
}
```</s>
