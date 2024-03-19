<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
40

```
N = int(input())
ans = 0
x = 1
while 2*x-1 <= N:
    x = 2*x
    ans += 1
print(ans)


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        int x = 1;
        while (2*x-1 <= N) {
            x = 2*x;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```
This code takes an integer `N` as input and calculates the number of times the loop will run. The loop runs until `2*x-1` is greater than or equal to `N`, and at each iteration, `x` is doubled and `ans` is incremented by 1. The final value of `ans` is printed as the output.

Note that this code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output.</s>
