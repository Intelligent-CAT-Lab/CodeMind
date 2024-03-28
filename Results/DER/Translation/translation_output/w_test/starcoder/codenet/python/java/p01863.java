<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
NicoNicoNi

Expected output:
Love Nico!


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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 1000000007;
        int MOD2 = 2147483647;
        long acc1 = 0;
        long acc2 = 0;
        long[] hlst1 = new long[length + 1];
        long[] hlst2 = new long[length + 1];
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int x = (int)c;
            acc1 = (acc1 * BASE + x) % MOD1;
            acc2 = (acc2 * BASE + x) % MOD2;
            hlst1[i + 1] = acc1;
            hlst2[i + 1] = acc2;
        }
        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2!= 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            long ha1 = (hlst1[alen] - hlst1[0] * Math.pow(BASE, alen, MOD1)) % MOD1;
            long ha2 = (hlst2[alen] - hlst2[0] * Math.pow(BASE, alen, MOD2)) % MOD2;
            long ha3 = (hlst1[blen + alen * 2] - hlst1[alen] * Math.pow(BASE, alen, MOD1)) % MOD1;
            long hb1 = (hlst1[alen + blen] - hlst1[alen] * Math.pow(BASE, blen, MOD1)) % MOD1;
            long hb2 = (hlst2[blen + alen * 2] - hlst2[alen] * Math.pow(BASE, blen, MOD2)) % MOD2;
            if (ha1!= ha2 || ha1!= ha3 || hb1!= hb2) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        } else {
            System.out.println("mitomerarenaiWA");
        }
    }
}
```

'''
<|endoftext|>
