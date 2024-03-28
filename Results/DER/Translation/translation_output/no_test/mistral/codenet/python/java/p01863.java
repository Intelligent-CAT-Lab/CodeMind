<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
  if ha1 != ha2:continue
  ha3 = calc_hash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen)
  if ha1 != ha3:continue
  hb1 = calc_hash(alen, alen + blen, blen)
  hb2 = calc_hash(blen + alen * 2, blen * 2 + alen * 2, blen)
  if hb1 != hb2:continue
  print("Love {}!".format(s[:i + 1 + blen]))
  break
else:
  print("mitomerarenaiWA")


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 1000000007;
        int MOD2 = 2147483647;
        int acc1 = 0;
        int acc2 = 0;
        List<Integer> hlst1 = new ArrayList<>(Arrays.asList(0));
        List<Integer> hlst2 = new ArrayList<>(Arrays.asList(0));
        for (char c : s.toCharArray()) {
            int i = (int) c;
            acc1 = (acc1 * BASE + i) % MOD1;
            acc2 = (acc2 * BASE + i) % MOD2;
            hlst1.add(acc1);
            hlst2.add(acc2);
        }

        List<Integer> calcHash(int left, int right, int xlen) {
            return Arrays.asList((hlst1.get(right) - hlst1.get(left) * Math.pow(BASE, xlen, MOD1)) % MOD1,
                                   (hlst2.get(right) - hlst2.get(left) * Math.pow(BASE, xlen, MOD2)) % MOD2);
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            List<Integer> ha1 = calcHash(0, alen, alen);
            List<Integer> ha2 = calcHash(alen + blen, blen + alen * 2, alen);
            if (!ha1.equals(ha2)) continue;
            List<Integer> ha3 = calcHash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (!ha1.equals(ha3)) continue;
            List<Integer> hb1 = calcHash(alen, alen + blen, blen);
            List<Integer> hb2 = calcHash(blen + alen * 2, blen * 2 + alen * 2, blen);
            if (!hb1.equals(hb2)) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen));
            break;
        }
        System.out.println("mitomerarenaiWA");
    }
}
```</s>
