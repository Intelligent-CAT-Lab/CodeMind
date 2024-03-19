<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
29
-60

```
import java.util.Scanner;

public class p03920 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    while (N > 0) {
      int sum = 0;
      for (int i = 1; ; i++) {
        sum += i;
        if (sum >= N) {
          System.out.println(i);
          N -= i;
          break;
        }
      }
    }
  }

}

```

### Response:
```python
import sys

def p03920():
    N = int(sys.stdin.readline())
    while N > 0:
        sum = 0
        for i in range(1, N+1):
            sum += i
            if sum >= N:
                print(i)
                N -= i
                break

if __name__ == "__main__":
    p03920()
```

In this Python code, we use `sys.stdin.readline()` to read the input from the standard input. The `range(1, N+1)` is used to iterate from 1 to N (inclusive). The `if sum >= N` condition checks if the sum of the numbers is greater than or equal to N. If it is, it prints the current number and subtracts it from N. The loop continues until N becomes 0.
<|EOT|>
