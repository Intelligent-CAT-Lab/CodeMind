Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
111100

Expected output:
-30

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
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class AAccepted:
    def solve(self, testNumber, in, out):
        s = in.next()
        n = 0
        for c in s:
            if c == '1':
                n += 1
        out.println(n)

class p03587:
    def main(self, args):
        inputStream = System.in
        outputStream = System.out
        in = Scanner(inputStream)
        out = PrintWriter(outputStream)
        solver = AAccepted()
        solver.solve(1, in, out)
        out.close()

if __name__ == '__main__':
    p03587().main(None)
```

Explanation:

- We first import the necessary classes from the java library.
- We define a class `AAccepted` which contains the `solve` method that takes in the test number, input stream, and output stream.
- Inside the `solve` method, we read the input string `s` and initialize a variable `n` to 0.
- We then iterate through each character `c` in the string `s` and check if it is equal to '1'. If it is, we increment the value of `n`.
- Finally, we print the value of `n` to the output stream.
- We then define a class `p03587` which contains the `main` method that initializes the input and output streams, creates a `Scanner` and `PrintWriter` object, creates an instance of the `AAccepted` class, and calls the `solve` method with the test number, input stream, and output stream.
- Finally, we call the `main` method with `None` as the argument to run the program.<|endoftext|>
