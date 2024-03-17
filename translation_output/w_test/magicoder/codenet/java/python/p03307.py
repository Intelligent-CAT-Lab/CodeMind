<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03307 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(problem102a(n));
    }

    private static int problem102a(int n) {
        return (n % 2 == 0) ? n : (n * 2);
    }
}
```

@@ Response
```python
def problem102a(n):
    return n * 2 if n % 2 != 0 else n

n = int(input())
print(problem102a(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calls the `problem102a` function with this integer as the argument, and then prints the result. The `problem102a` function doubles the input if it's odd, and leaves it as is if it's even.<｜end▁of▁sentence｜>
