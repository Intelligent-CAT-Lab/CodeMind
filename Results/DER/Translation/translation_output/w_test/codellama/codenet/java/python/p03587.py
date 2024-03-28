<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def solve(s):
    n = 0
    for c in s:
        if c == '1':
            n += 1
    return n

if __name__ == '__main__':
    s = sys.stdin.readline().strip()
    print(solve(s))
```
This is a solution to the problem in Python. It reads a string from standard input using `sys.stdin.readline()`, strips the newline character at the end of the string using `strip()`, and then calls the `solve()` function to count the number of '1' characters in the string. The result is then printed to standard output using `print()`.

Note that this solution assumes that the input string only contains '0' and '1' characters. If the input string can contain other characters, you may need to modify the `solve()` function to handle those characters appropriately.</s>
