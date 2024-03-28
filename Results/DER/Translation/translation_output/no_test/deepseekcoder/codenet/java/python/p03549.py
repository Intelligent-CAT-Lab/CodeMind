<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())

    X = 1900 * M + 100 * (N - M)

    rate = 1

    for _ in range(M):
        rate *= 2

    print(rate * X)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates a value `X` based on these integers, and then calculates and prints a result based on `X` and `rate`. The `rate` is calculated by doubling it `M` times.
<|EOT|>
