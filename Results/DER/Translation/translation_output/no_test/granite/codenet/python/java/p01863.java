System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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

        long[] hash = new long[length + 1];
        for (int i = 0; i < length; i++) {
            hash[i + 1] = (hash[i] * BASE + s.charAt(i)) % MOD1;
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
            long ha1 = (hash[alen] - hash[0] * pow(BASE, alen, MOD1) + MOD1) % MOD1;
            long ha2 = (hash[alen + blen] - hash[alen] * pow(BASE, blen, MOD1) + MOD1) % MOD1;
            if (ha1!= ha2) {
                continue;
            }
            long ha3 = (hash[blen * 2 + alen * 2] - hash[blen * 2 + alen * 3] * pow(BASE, alen, MOD1) + MOD1) % MOD1;
            if (ha1!= ha3) {
                continue;
            }
            long hb1 = (hash[alen + blen] - hash[alen] * pow(BASE, blen, MOD1) + MOD1) % MOD1;
            long hb2 = (hash[blen * 2 + alen * 2] - hash[blen + alen * 2] * pow(BASE, blen, MOD1) + MOD1) % MOD1;
            if (hb1!= hb2) {
                continue;
            }
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        }
        if (true) {
            System.out.println("mitomerarenaiWA");
        }
    }

    public static long pow(int x, int n, int mod) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = result * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return result;
    }
}
```<|endoftext|>
