<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3800


```
import java.util.*;

public class p03549 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();

    sc.close();

    int X = 1900 * M + 100 * (N - M);

    int rate = 1;

    for (int i = 1; i <= M; i++){
      rate *= 2;
    }

    System.out.println(rate * X);

  }

}
```
[/INST]
```
import sys

N, M = map(int, sys.stdin.readline().split())

X = 1900 * M + 100 * (N - M)

rate = 1
for i in range(1, M+1):
    rate *= 2

print(rate * X)
```
This code first reads the input from the user, which is a pair of integers `N` and `M`. It then calculates the value of `X` using the formula provided in the problem statement.

Next, it initializes the value of `rate` to 1 and then loops through the range of `M` to calculate the value of `rate` using the formula provided in the problem statement.

Finally, it prints the result of `rate * X` to the console.</s>
