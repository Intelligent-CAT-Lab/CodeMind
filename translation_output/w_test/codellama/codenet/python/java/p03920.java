<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3


```
N = int(input())
w = 0
for i in range(10 ** 5):
    if i * (i + 1) // 2 < N <= (i + 1) * (i + 2) // 2:
        w = i + 1
        break
for i in range(w, 0, -1):
    if N >= i:
        print(i)
        N -= i
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        for (int i = 1; i <= 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i >= 1; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It first reads an integer `N` from the user, and then it uses a loop to find the value of `w` that satisfies the condition \begin{code}
i * (i + 1) / 2 < N <= (i + 1) * (i + 2) / 2
\end{code}. Once `w` is found, it uses another loop to print the values of `i` that satisfy the condition `N >= i`.

Note that the code uses the `Scanner` class to read the input from the user, and it uses the `System.out.println()` method to print the output.</s>
