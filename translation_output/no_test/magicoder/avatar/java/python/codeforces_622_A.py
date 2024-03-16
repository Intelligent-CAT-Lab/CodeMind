<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_622_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(br.readLine());
        long n = (long) ((Math.sqrt(1 + (8 * n1)) - 1) / 2);
        long ans = n1 - (((n + 1) * n) / 2);
        System.out.print((ans != 0) ? ans : n);
    }
}
```

@@ Response
```python
import sys
import math

def main():
    n1 = int(sys.stdin.readline())
    n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
    ans = n1 - ((n + 1) * n // 2)
    print(ans if ans != 0 else n)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the value of `n` and `ans`, and then prints `ans` if it's not zero, otherwise it prints `n`.<｜end▁of▁sentence｜>
