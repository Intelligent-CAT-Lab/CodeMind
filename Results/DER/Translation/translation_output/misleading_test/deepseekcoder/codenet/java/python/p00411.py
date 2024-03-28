<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
0.057217574079786004

```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```

### Response:
```python
import sys

def calculate_time(a, t, r):
    return r * t / a

a, t, r = map(int, sys.stdin.readline().split())
print(calculate_time(a, t, r))
```

In this Python code, we first import the `sys` module to read input from the standard input. Then we define a function `calculate_time` that takes three arguments `a`, `t`, and `r` and returns the result of the calculation `r * t / a`. We read the three inputs from the standard input, convert them to integers using `map`, and pass them to the `calculate_time` function. The result is printed to the standard output.
<|EOT|>
