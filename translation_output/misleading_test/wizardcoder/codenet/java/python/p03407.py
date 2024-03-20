Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
50 100 120

Expected output:
Ye7s

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
            out.println(in.nextInt() + in.nextInt() >= in.nextInt()? "Yes" : "No");
        }

    }
}


```

### Response:
```python
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class ATwoCoins:
    def solve(self, testNumber, in, out):
        out.println(in.nextInt() + in.nextInt() >= in.nextInt() and "Yes" or "No")

class p03407:
    def main(self, args):
        inputStream = System.in
        outputStream = System.out
        in = Scanner(inputStream)
        out = PrintWriter(outputStream)
        solver = ATwoCoins()
        solver.solve(1, in, out)
        out.close()

if __name__ == '__main__':
    p03407().main(None)
```

Explanation:

- We first import the necessary classes from the java package.
- We define a class `ATwoCoins` which contains the `solve` method that takes in the test number, input stream, and output stream.
- Inside the `solve` method, we use the `in` object to read the input values and use the `out` object to print the output values.
- We then define the `p03407` class which contains the `main` method that creates a new instance of the `ATwoCoins` class and calls its `solve` method.
- Finally, we call the `main` method with `None` as the argument to run the program.<|endoftext|>
