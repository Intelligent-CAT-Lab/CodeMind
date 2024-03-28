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
 * @author mikit
 */
public class p03407 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATwoCoins solver = new ATwoCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoCoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            out.println(in.nextInt() + in.nextInt() >= in.nextInt() ? "Yes" : "No");
        }

    }
}


```

@@ Response
```python
import sys

class ATwoCoins:
    def solve(self, testNumber):
        a, b, c = map(int, sys.stdin.readline().split())
        print("Yes" if a + b >= c else "No")

if __name__ == "__main__":
    solver = ATwoCoins()
    solver.solve(1)
```

In this Python code, we define a class `ATwoCoins` with a method `solve` that reads three integers from the standard input (`sys.stdin.readline().split()`), calculates their sum, and prints "Yes" if the sum is greater than or equal to the third integer, and "No" otherwise. The `if __name__ == "__main__":` block is used to run the `solve` method when the script is run directly.<｜end▁of▁sentence｜>
