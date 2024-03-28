<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
-53.85961348061815

```
import java.util.Scanner;

public class p02897 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}

```

### Response:
```python
n = int(input())

odd = 0
not_odd = 0
for i in range(1, n + 1):
    if i % 2 == 0:
        not_odd += 1
    else:
        odd += 1

print(odd / n)
```

In this Python code, we are taking the input `n` and initializing two variables `odd` and `not_odd` to 0. We then run a loop from 1 to `n` (inclusive). If the current number `i` is even (i.e., `i % 2 == 0`), we increment `not_odd` by 1. Otherwise, we increment `odd` by 1. Finally, we print the ratio of `odd` to `n`.
<|EOT|>
