System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 10000000007;
        int MOD2 = 2147483647;
        long acc1 = 0;
        long acc2 = 0;
        List<Long> hlst1 = new ArrayList<>();
        List<Long> hlst2 = new ArrayList<>();
        hlst1.add(0L);
        hlst2.add(0L);
        for (char c : s.toCharArray()) {
            int i = (int) c;
            acc1 = (acc1 * BASE + i) % MOD1;
            acc2 = (acc2 * BASE + i) % MOD2;
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2!= 0) {
                continue;
            }
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) {
                continue;
            }
            long[] ha1 = getHash(hlst1, 0, alen, alen);
            long[] ha2 = getHash(hlst1, alen + blen, blen + alen * 2, alen);
            if (!Arrays.equals(ha1, ha2)) {
                continue;
            }
            long[] ha3 = getHash(hlst1, blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (!Arrays.equals(ha1, ha3)) {
                continue;
            }
            long[] hb1 = getHash(hlst1, alen, alen + blen, blen);
            long[] hb2 = getHash(hlst1, blen + alen * 2, blen * 2 + alen * 2, blen);
            if (!Arrays.equals(hb1, hb2)) {
                continue;
            }
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        }
        if (true) {
            System.out.println("mitomerarenaiWA");
        }
    }

    private static long[] getHash(List<Long> hlst, int left, int right, int xlen) {
        long[] res = new long[2];
        res[0] = (hlst.get(right) - hlst.get(left) * pow(BASE, xlen, MOD1)) % MOD1;
        res[1] = (hlst.get(right) - hlst.get(left) * pow(BASE, xlen, MOD2)) % MOD2;
        return res;
    }

    private static long pow(int base, int exp, int mod) {
        long res = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = res * base % mod;
            }
            base = (int) ((long) base * base % mod);
            exp /= 2;
        }
        return res;
    }
}
```<|endoftext|>
