<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
65

```
N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int t = 1;
        int n = 1;
        int a = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t++;
        }
        System.out.println(t);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses the `while` loop to iterate until the condition `N < a` is met. The `t` variable is used to keep track of the number of iterations, and the `n` and `a` variables are used to calculate the number of steps needed to reach the target number `N`. The `print` statement is used to output the final result.</s>
