<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
FESSSSSSSTIVAL


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

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = 512;
        int pattern = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = factorial(7 + i) / factorial(i) / factorial(7);
        }
        a = reverse(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        ans = reverse(ans);
        System.out.println(String.join("", ans));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }

    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }
}
```
This is the Java code for the given Python code. The `factorial` function is implemented using a recursive approach, and the `reverse` function is implemented using a loop. The rest of the code is similar to the Python code.</s>
