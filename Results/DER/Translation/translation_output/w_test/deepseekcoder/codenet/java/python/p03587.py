<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def count_ones(s):
    return s.count('1')

print(count_ones(input()))
```
<|EOT|>
