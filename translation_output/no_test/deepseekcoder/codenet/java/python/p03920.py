<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
while True:
    N = int(input())
    if N <= 0:
        break
    sum = 0
    for i in range(1, N+1):
        sum += i
        if sum >= N:
            print(i)
            N -= i
            break
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and for each integer, it finds the smallest number `i` such that the sum of the first `i` integers is greater or equal to the input number. It then prints `i` and subtracts `i` from the input number. The process continues until the input number is less than or equal to zero.
<|EOT|>
