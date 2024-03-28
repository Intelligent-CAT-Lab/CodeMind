<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
FsESSSSSSSTIVAL

```
import math
import sys
input = sys.stdin.readline

k = int(input())

n = 512
pattern = 0
a = []
for i in range(n):
    val = math.factorial(7 + i) // math.factorial(i) // math.factorial(7)
    a.append(val)
a.reverse()

cnt = 600 * 7 
ans = ["FESTIVA" for _ in range(n)]
for i, item in enumerate(a):
    ans[i] += ("L" * (k // item))
    k %= item
ans.reverse()
print("".join([str(item) for item in ans]))
```
[/INST]
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = BigInteger.ONE.multiply(BigInteger.valueOf(7 + i)).divide(BigInteger.valueOf(i).multiply(BigInteger.valueOf(7)));
            a[i] = val;
        }
        for (int i = 0; i < n; i++) {
            a[i].reverse();
        }
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            for (int j = 0; j < k / a[i]; j++) {
                ans[i] += "L";
            }
            k %= a[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i].substring(ans[i].length() - 1);
        }
        System.out.println(String.join("", ans));
    }
}
```</s>
