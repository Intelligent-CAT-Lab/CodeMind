<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2 5

Expected output:
84


```
    import java.util.*;
    public class p03478 {
      public static void main(String...args) {
      	final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= N; i++) {
          int sum = 0;
          for(int j = i; j > 0; j /= 10)
            sum += j % 10;
          if(A <= sum && sum <= B)
            ans += i;
        }
        System.out.println(ans);
      }
    }
```
[/INST]
```python
import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(1, N+1):
        sum = 0
        for j in range(i, 0, -1):
            sum += j % 10
        if A <= sum <= B:
            ans += i
    print(ans)

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input from a string to a list of integers. The `range` function is used to iterate over the numbers from 1 to N. The `sys.stdin.readline()` function is used to read a line of input from the user. The `split()` function is used to split the input into a list of strings. The `int()` function is used to convert the strings to integers.</s>
