<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
68

```
N,X,T= map(int,input().split())
if N%X != 0:
  print((N//X)*T+T)
else:
  print((N//X)*T)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        if (N % X != 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it uses the `if` statement to check if the value of `N` is divisible by `X`. If it is not divisible, it prints the result of the calculation `(N / X) * T + T`, which is the number of times `T` needs to be added to the result of the calculation `(N / X) * T`. If `N` is divisible by `X`, it simply prints the result of the calculation `(N / X) * T`.</s>
