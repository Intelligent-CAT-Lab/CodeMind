<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.ceil;

public class codeforces_672_A {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        String s = " ";
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        out.print(s.charAt(n - 1));
        out.close();
    }
}
```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    s = " "
    for i in range(1, n + 1):
        s += str(i)
    print(s[n - 1])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, generates a string of digits from 1 to n, and then prints the nth character of the string. The `sys.stdin.readline()` function is used to read from the standard input, and the `print()` function is used to write to the standard output.
<|EOT|>
