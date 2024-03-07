<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.math.BigInteger;

public class Festiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int n = 512;
        int pattern = 0;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = BigInteger.valueOf(7 + i).factorial().divide(BigInteger.valueOf(i).factorial()).divide(BigInteger.valueOf(7).factorial());
            a[i] = val;
        }
        a = Arrays.reverse(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        ans = Arrays.reverse(ans);
        System.out.println(String.join("", ans));
    }
}
```
Note that the `BigInteger` class is used to handle large numbers, and the `Arrays.reverse` method is used to reverse the order of the `a` array. The `String.join` method is used to concatenate the elements of the `ans` array into a single string.</s>
