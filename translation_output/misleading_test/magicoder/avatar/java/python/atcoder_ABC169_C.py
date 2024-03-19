<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561275

```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long c = (long) Math.round(b * 100);
        long d = a * c;
        System.out.println(d / 100);
    }
}
```

@@ Response
```python
import sys

def main():
    a, b = map(float, sys.stdin.readline().split())
    c = round(b * 100)
    d = a * c
    print(int(d / 100))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map(float, sys.stdin.readline().split())` function splits the input into two parts, converts them into float numbers, and assigns them to `a` and `b` respectively. Then we calculate `c` by rounding `b` to the nearest integer and `d` by multiplying `a` and `c`. Finally, we print the integer part of `d` divided by 100.<｜end▁of▁sentence｜>
