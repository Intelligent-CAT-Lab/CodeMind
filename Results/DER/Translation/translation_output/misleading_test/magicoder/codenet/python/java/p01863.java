<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 1000000007;
        int MOD2 = 2147483647;
        int acc1 = 0;
        int acc2 = 0;
        int[] hlst1 = new int[length + 1];
        int[] hlst2 = new int[length + 1];
        for (int i = 0; i < length; i++) {
            int c = s.charAt(i);
            acc1 = (acc1 * BASE + c) % MOD1;
            acc2 = (acc2 * BASE + c) % MOD2;
            hlst1[i + 1] = acc1;
            hlst2[i + 1] = acc2;
        }

        int[] calcHash(int left, int right, int xlen) {
            int[] result = new int[2];
            result[0] = (hlst1[right] - hlst1[left] * (int) Math.pow(BASE, xlen) % MOD1 + MOD1) % MOD1;
            result[1] = (hlst2[right] - hlst2[left] * (int) Math.pow(BASE, xlen) % MOD2 + MOD2) % MOD2;
            return result;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            int[] ha1 = calcHash(0, alen, alen);
            int[] ha2 = calcHash(alen + blen, blen + alen * 2, alen);
            if (ha1[0] != ha2[0] || ha1[1] != ha2[1]) continue;
            int[] ha3 = calcHash(blen * 2 + alen * 2, blen * 2 + alen * 3, alen);
            if (ha1[0] != ha3[0] || ha1[1] != ha3[1]) continue;
            int[] hb1 = calcHash(alen, alen + blen, blen);
            int[] hb2 = calcHash(blen + alen * 2, blen * 2 + alen * 2, blen);
            if (hb1[0] != hb2[0] || hb1[1] != hb2[1]) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            break;
        } else {
            System.out.println("mitomerarenaiWA");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, calculates the hash values for the string, and then checks if the hash values of the substrings of the string are the same. If they are, it prints the substring followed by "Love" and a "!". If it doesn't find any such substring, it prints "mitomerarenaiWA".<｜end▁of▁sentence｜>
