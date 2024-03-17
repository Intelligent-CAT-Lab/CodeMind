<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


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

@@ Response
```python
def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

a, b = map(int, input().split())
print(GCD(a, b))
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates their greatest common divisor using the `GCD` function, and then prints the result. The `GCD` function uses the Euclidean algorithm to find the greatest common divisor of two numbers.<｜end▁of▁sentence｜>
