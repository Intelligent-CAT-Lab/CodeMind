<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3


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
    N = int(sys.stdin.readline().strip())
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

This Python code reads an integer from the standard input, and for each number, it finds the smallest number `i` such that the sum of the first `i` numbers is greater or equal to the input number. It then prints `i` and subtracts `i` from the input number. The process continues until the input number is 0.
<|EOT|>
