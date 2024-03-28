<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 4 3

Expected output:
1


```
import java.util.*;

public class p02951 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if(b + c < a){
              System.out.println(0);
          } else {
            System.out.println(b + c - a);
          }
        }
    }
```

### Response:
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if b + c < a:
        print(0)
    else:
        print(b + c - a)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. If the sum of `b` and `c` is less than `a`, we print `0`. Otherwise, we print the difference between the sum of `b` and `c` and `a`.
<|EOT|>
