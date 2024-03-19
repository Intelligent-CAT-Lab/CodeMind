<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def calculate_volume(a, t, r):
    return r * t / a

if __name__ == "__main__":
    a, t, r = map(float, sys.stdin.readline().split())
    print(calculate_volume(a, t, r))
```

In this Python code, we first import the `sys` module which provides access to some variables used or maintained by the interpreter and to functions that interact strongly with the interpreter.

Then we define a function `calculate_volume` that takes three arguments `a`, `t`, and `r` and returns the volume of the cylinder.

In the `if __name__ == "__main__":` block, we read the input from the standard input (sys.stdin), split it into three parts using the `split()` function, and convert each part to a float using the `map()` function.

Finally, we call the `calculate_volume` function with the three input values and print the result.<｜end▁of▁sentence｜>
