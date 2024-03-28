Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int length = s.length();
    int BASE = 100;
    int MOD1 = 1000000007;
    int MOD2 = 2147483647;
    long acc1 = 0;
    long acc2 = 0;
    List<Long> hlst1 = new ArrayList<Long>();
    List<Long> hlst2 = new ArrayList<Long>();
    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      acc1 = (acc1 * BASE + (int)c) % MOD1;
      acc2 = (acc2 * BASE + (int)c) % MOD2;
      hlst1.add(acc1);
      hlst2.add(acc2);
    }

    long[] calc_hash(int left, int right, int xlen) {
      long hash1 = (hlst1.get(right) - hlst1.get(left) * pow(BASE, xlen, MOD1)) % MOD1;
      long hash2 = (hlst2.get(right) - hlst2.get(left) * pow(BASE, xlen, MOD2)) % MOD2;
      return new long[]{hash1, hash2};
    }

    for (int i = length / 3; i >= 0; i--) {
      if ((length - (i + 1) * 3) % 2!= 0) continue;
      int alen = i + 1;
      int blen = (length - (i + 1) * 3) / 2;
      if (blen <= 0) continue;
      long[] ha1 = calc_hash(0, alen, alen);
      long[] ha2 = calc_hash(alen + blen, blen + alen * 2, alen);
      if (ha1[0]!= ha2[0] || ha1[1]!= ha2[1]) continue;
      long[] ha3 = calc_hash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
      if (ha1[0]!= ha3[0] || ha1[1]!= ha3[1]) continue;
      long[] hb1 = calc_hash(alen, alen + blen, blen);
      long[] hb2 = calc_hash(blen + alen * 2, blen * 2 + alen * 2, blen);
      if (hb1[0]!= hb2[0] || hb1[1]!= hb2[1]) continue;
      System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
      break;
    } else {
      System.out.println("mitomerarenaiWA");
    }
  }
}
```<|endoftext|>
