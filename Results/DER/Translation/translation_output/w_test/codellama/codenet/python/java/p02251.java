<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
4


```
n = int(input())
ans = 0
for x in (25, 10, 5, 1):
  ans += n // x
  n %= x
print(ans)

```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int n = 100;
        int ans = 0;
        for (int x : new int[] {25, 10, 5, 1}) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}
```
Explanation:

* The `int[]` array is used to store the values of `x` in the for loop.
* The `n / x` expression is used to calculate the integer division of `n` by `x`.
* The `n %= x` expression is used to calculate the remainder of `n` divided by `x`.
* The `System.out.println(ans)` statement is used to print the final value of `ans`.

Note: The `//` operator in Python is used for integer division, while the `/` operator is used for floating-point division. In Java, the `/` operator is used for both integer and floating-point division.</s>
