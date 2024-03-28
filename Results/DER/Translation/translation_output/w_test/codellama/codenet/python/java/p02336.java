<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
6


```
n,k = map(int, input().split())
if k > n:
    print(0)
    quit()
ans = 1
for i in range(1,k):
    ans *= n-i
    ans //= i
ans %= 1000000007
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k > n) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 1; i <= k; i++) {
            ans *= n - i;
            ans /= i;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It first reads in the input from the user, and then it checks if the value of `k` is greater than `n`. If it is, it prints `0` and returns. Otherwise, it calculates the value of `ans` using the same logic as the Python code, and then it prints the result.

Note that in Java, the `%` operator is used for modulo division, and the `//` operator is used for integer division. Also, in Java, the `long` data type is used to represent large integers, while in Python, the `int` data type is used.</s>
