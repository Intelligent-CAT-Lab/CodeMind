Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
NicoNicoNi

Expected output:
Nico!

```
s = input()
length = len(s)
BASE = 100
MOD1 = 1000000007
MOD2 = 2147483647
acc1 = 0
acc2 = 0
hlst1 = [0]
hlst2 = [0]
for c in s:
  i = ord(c)
  acc1 = (acc1 * BASE + i) % MOD1
  acc2 = (acc2 * BASE + i) % MOD2
  hlst1.append(acc1)
  hlst2.append(acc2)

def calc_hash(left, right, xlen):
  return ((hlst1[right] - hlst1[left] * pow(BASE, xlen, MOD1)) % MOD1,
          (hlst2[right] - hlst2[left] * pow(BASE, xlen, MOD2)) % MOD2)

for i in range(length // 3, -1, -1):
  if (length - (i + 1) * 3) % 2:continue
  alen = i + 1
  blen = (length - (i + 1) * 3) // 2
  if blen <= 0:continue
  ha1 = calc_hash(0, alen, alen)
  ha2 = calc_hash(alen + blen, blen + alen * 2, alen)
  if ha1!= ha2:continue
  ha3 = calc_hash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen)
  if ha1!= ha3:continue
  hb1 = calc_hash(alen, alen + blen, blen)
  hb2 = calc_hash(blen + alen * 2, blen * 2 + alen * 2, blen)
  if hb1!= hb2:continue
  print("Love {}!".format(s[:i + 1 + blen]))
  break
else:
  print("mitomerarenaiWA")


```

### Response:
```java
import java.util.*;
import java.math.*;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 1000000007;
        int MOD2 = 2147483647;
        long acc1 = 0;
        long acc2 = 0;
        List<Long> hlst1 = new ArrayList<>();
        List<Long> hlst2 = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            acc1 = (acc1 * BASE + (int) c) % MOD1;
            acc2 = (acc2 * BASE + (int) c) % MOD2;
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        BiFunction<Integer, Integer, Pair<Long, Long>> calc_hash = (left, right) -> {
            long xlen = right - left + 1;
            return new Pair<>(
                    (hlst1.get(right) - hlst1.get(left) * pow(BASE, xlen, MOD1)) % MOD1,
                    (hlst2.get(right) - hlst2.get(left) * pow(BASE, xlen, MOD2)) % MOD2
            );
        };

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2!= 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            Pair<Long, Long> ha1 = calc_hash.apply(0, alen);
            Pair<Long, Long> ha2 = calc_hash.apply(alen + blen, blen + alen * 2);
            if (!ha1.equals(ha2)) continue;
            Pair<Long, Long> ha3 = calc_hash.apply(blen * 2 + alen * 2, blen * 2 + alen * 3);
            if (!ha1.equals(ha3)) continue;
            Pair<Long, Long> hb1 = calc_hash.apply(alen, alen + blen);
            Pair<Long, Long> hb2 = calc_hash.apply(blen + alen * 2, blen * 2 + alen * 2);
            if (!hb1.equals(hb2)) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        } else {
            System.out.println("mitomerarenaiWA");
        }
    }

    static long pow(long base, long exponent, long mod) {
        if (exponent == 0) return 1;
        if (exponent % 2 == 0) {
            long half = pow(base, exponent / 2, mod);
            return (half * half) % mod;
        } else {
            return (base * pow(base, exponent - 1, mod)) % mod;
        }
    }

    static class Pair<T, U> {
        T first;
        U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass()!= o.getClass()) return false;
            Pair<?,?> pair = (Pair<?,?>) o;
            return Objects.equals(first, pair.first) &&
                    Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
```<|endoftext|>
