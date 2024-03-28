<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2 5

Expected output:
94

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

### Response:
```python
import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(1, N+1):
        sum_digits = sum(int(digit) for digit in str(i))
        if A <= sum_digits <= B:
            ans += i
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, then iterates over the range from 1 to N (inclusive). For each number i in this range, it calculates the sum of the digits of i, and if this sum is between A and B (inclusive), it adds i to the total sum `ans`. Finally, it prints the total sum `ans`.
<|EOT|>
