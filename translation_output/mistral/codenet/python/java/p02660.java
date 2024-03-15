<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> res = primeFactorize(n);
        if (res.size() == 1) {
            System.out.println(1);
        } else {
            int cnt = 0;
            Set<Integer> l = new HashSet<>();
            for (int r : res) {
                if (l.contains(r)) {
                    cnt++;
                } else {
                    l.clear();
                    cnt = 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
```</s>
