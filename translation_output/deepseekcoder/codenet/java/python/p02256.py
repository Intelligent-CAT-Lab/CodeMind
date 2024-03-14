<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;

class p02256 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(GCD(a, b));
    }

    public static int GCD (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) return b;
        else return GCD (b, a%b);
    }
}
```

### Response:
```python
import sys

def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0: 
        return b
    else: 
        return GCD(b, a % b)

input_values = sys.stdin.readline().split()
a = int(input_values[0])
b = int(input_values[1])

print(GCD(a, b))
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates their greatest common divisor using the `GCD` function, and then prints the result. The `GCD` function uses the Euclidean algorithm to calculate the greatest common divisor.
<|EOT|>
