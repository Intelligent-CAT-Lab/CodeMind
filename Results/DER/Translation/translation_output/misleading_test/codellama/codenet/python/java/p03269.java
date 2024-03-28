<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
 4
1 2 0
12 1
2 3 (0
q2 3 2

```
l = int(input())

d = max([d for d in range(30) if 2**d <= l])
n = d+1
m = 2*d
ans = []
for i in range(1, n):
    ans.append((i, i+1, 0))
    ans.append((i, i+1, 2**(i-1)))

while l > 2**d:
    for i in range(n-1, 0, -1):
        if l-2**(i-1) > 2**d-1:
            ans.append((i, n, l-2**(i-1)))
            m += 1
            l -= 2**(i-1)
            break

print(n, m)
for a in ans:
    print(*a)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int d = 0;
        for (int i = 30; i >= 0; i--) {
            if (2^i <= l) {
                d = i;
                break;
            }
        }

        int n = d + 1;
        int m = 2 * d;
        int[][] ans = new int[n][3];

        for (int i = 1; i < n; i++) {
            ans[i][0] = i;
            ans[i][1] = i + 1;
            ans[i][2] = 0;
        }

        for (int i = n - 1; i > 0; i--) {
            if (l - 2^(i - 1) > 2^d - 1) {
                ans[i][0] = i;
                ans[i][1] = n;
                ans[i][2] = l - 2^(i - 1);
                m += 1;
                l -= 2^(i - 1);
                break;
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
}
```
This code first reads an integer `l` from the input and then calculates the value of `d` using a loop that iterates from 30 to 0. The loop stops when it finds the first value of `d` such that `2^d <= l`.

Next, the code calculates the values of `n` and `m` using the values of `d` and `l`. It then initializes a 2D array `ans` with the values of `n` and `m`.

The code then enters a loop that iterates from 1 to `n - 1`. For each iteration, it checks if `l - 2^(i - 1) > 2^d - 1`. If this condition is true, it adds a new row to the `ans` array with the values of `i`, `n`, and `l - 2^(i - 1)`. It then increments `m` and decrements `l` by the value of `2^(i - 1)`.

Finally, the code prints the values of `n`, `m`, and the contents of the `ans` array.</s>
