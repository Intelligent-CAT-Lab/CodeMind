<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
4


```
N = int(input())

ans, k = 1, 0
for i in range(2, N+1, 2):
    temp, res = i, 0
    while temp%2 == 0:
        res += 1
        temp //= 2
    if k < res:
        ans = i
        k = res
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 1, k = 0;
        for (int i = 2; i <= N; i += 2) {
            int temp = i, res = 0;
            while (temp % 2 == 0) {
                res++;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It first prompts the user to enter a number `N`, and then it iterates through the numbers from 2 to `N` in steps of 2. For each number, it calculates the number of times it can be divided by 2 without leaving a remainder, and it keeps track of the maximum value of this number. Finally, it prints the number that has the maximum value.

Note that in Java, the `//` operator is used for integer division, while the `%` operator is used for modulo (remainder) operations.</s>
