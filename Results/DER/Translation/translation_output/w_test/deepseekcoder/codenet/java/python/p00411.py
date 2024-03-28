<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
60.0


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
def p00411():
    a, t, r = map(int, input().split())
    print(r * t / a)

p00411()
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the result as `r * t / a`, and prints the result.
<|EOT|>
