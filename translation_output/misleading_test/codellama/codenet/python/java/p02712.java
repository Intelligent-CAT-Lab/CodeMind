<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
26

```
N = int(input())

ans = 0
for i in range(1, N + 1):
    if i % 5 != 0 and i % 3 != 0:
        ans += i

print(ans)

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0 && i % 3 != 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```
This code takes an integer `N` as input and calculates the sum of all numbers from 1 to `N` that are not divisible by 5 or 3. The result is then printed to the console.

Note that in Java, the `parseInt()` method is used to convert a string to an integer, and the `println()` method is used to print a string to the console.</s>
