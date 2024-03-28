<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())

    X = 1900 * M + 100 * (N - M)

    rate = 1

    for i in range(1, M+1):
        rate *= 2

    print(rate * X)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().split()` function to read the input from the console. This function splits the input into a list of strings, which we then convert to integers using the `map()` function. We then calculate the value of `X` and `rate` in the same way as in the Java code. Finally, we print the result of `rate * X`.
<|EOT|>
