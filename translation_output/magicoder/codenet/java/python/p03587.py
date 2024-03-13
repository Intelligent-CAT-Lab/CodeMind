<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

class AAccepted:
    def solve(self, testNumber, inp, out):
        s = inp.readline().strip()
        n = s.count('1')
        out.write(str(n) + '\n')

if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = AAccepted()
    solver.solve(1, inp, out)
    out.close()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of '1' characters in the string, and then writes the count to the standard output.<｜end▁of▁sentence｜>
