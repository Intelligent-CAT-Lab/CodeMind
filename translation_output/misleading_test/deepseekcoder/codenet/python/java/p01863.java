<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        final int BASE = 100;
        final int MOD1 = 1000000007;
        final int MOD2 = 2147483647;
        int acc1 = 0;
        int acc2 = 0;
        int[] hlst1 = new int[length + 1];
        int[] hlst2 = new int[length + 1];
        for (int i = 0; i < length; i++) {
            int c = (int) s.charAt(i);
            acc1 = (acc1 * BASE + c) % MOD1;
            acc2 = (acc2 * BASE + c) % MOD2;
            hlst1[i + 1] = acc1;
            hlst2[i + 1] = acc2;
        }

        for (int i = length / 3; i >= 0; i--) {
            if ((length - (i + 1) * 3) % 2 != 0) continue;
            int alen = i + 1;
            int blen = (length - (i + 1) * 3) / 2;
            if (blen <= 0) continue;
            if (!calcHash(hlst1, alen, alen).equals(calcHash(hlst1, alen + blen, alen))) continue;
            if (!calcHash(hlst1, blen + alen * 2, alen).equals(calcHash(hlst1, blen * 2 + alen * 2, alen))) continue;
            if (!calcHash(hlst1, alen, alen + blen).equals(calcHash(hlst1, blen + alen * 2, blen))) continue;
            System.out.println("Love " + s.substring(0, i + 1 + blen) + "!");
            return;
        }
        System.out.println("mitomerarenaiWA");
    }

    private static Pair calcHash(int[] hlst, int left, int right) {
        return new Pair((hlst[right] - hlst[left] * pow(BASE, right - left, MOD1)) % MOD1,
                (hlst[right] - hlst[left] * pow(BASE, right - left, MOD2)) % MOD2);
    }

    private static int pow(int a, int b, int m) {
        int result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return result;
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pair pair = (Pair) obj;
            return first == pair.first && second == pair.second;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, calculates its hash values, and then checks if there is a substring that can be divided into three parts, where the first part is the same as the second part and the second part is the same as the third part. If such a substring exists, it prints it out. If not, it prints "mitomerarenaiWA".
<|EOT|>
