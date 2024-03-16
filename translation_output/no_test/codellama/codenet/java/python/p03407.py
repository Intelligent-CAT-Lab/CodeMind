<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = input_stream.readline().strip()
    out = output_stream.write
    solver = ATwoCoins()
    solver.solve(1, in, out)

class ATwoCoins:
    def solve(self, test_number, in, out):
        out.write("Yes" if int(in) + int(in) >= int(in) else "No")

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read from standard input and write to standard output, and it defines a `ATwoCoins` class with a `solve` method that takes the input, performs the necessary calculations, and writes the output to the output stream. The `main` function is the entry point of the program, and it reads the input from standard input, creates an instance of the `ATwoCoins` class, and calls its `solve` method with the input and output streams as arguments.</s>
