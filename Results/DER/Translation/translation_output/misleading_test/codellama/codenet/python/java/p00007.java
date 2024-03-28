<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
130038

```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int)ans);
    }
}
```
This code takes an integer `n` as input and calculates the result of the given formula `ans *= 1.05` `n` times. It then rounds the result to the nearest integer and prints it.

The `if` statement checks if the result of the multiplication is not a multiple of 1000, and if it's not, it adds 1000 to the result to make it a multiple of 1000. This is done to ensure that the result is always a multiple of 1000.

The `int` cast is used to convert the result to an integer, which is then printed to the console.</s>
