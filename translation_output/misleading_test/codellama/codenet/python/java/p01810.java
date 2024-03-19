<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
-15

```
n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }
        System.out.println(a);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `int` data type to store the values of `n` and `k`. The `for` loop iterates `n - 1` times and calculates the value of `a` for each iteration. The `a / (k - 1) + 1` expression calculates the value of `a` for the current iteration, and the `+=` operator adds it to the previous value of `a`. Finally, the `System.out.println(a)` statement prints the final value of `a` to the console.</s>
