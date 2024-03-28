<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
111100

Expected output:
4


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class p03587 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AAccepted solver = new AAccepted();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAccepted {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int n = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') n++;
            }
            out.println(n);
        }

    }
}


```

@@ Response
```python
import sys

def solve(s):
    n = 0
    for c in s:
        if c == '1':
            n += 1
    return n

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))
```

In this Python code, we define a function `solve` that takes a string `s` as input and counts the number of '1's in the string. We then read the input string from the standard input (`sys.stdin.readline().strip()`), call the `solve` function with the input string, and print the result.<｜end▁of▁sentence｜>
