<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7

Expected output:
80

```
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class p03644 {
    public static PrintWriter out;

    public static void main(String[] args) {
        p03644.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        out.println(count(Integer.parseInt(sc.next())));
        out.close();
        sc.close();
    }

    private static int count(int pnum) {
        int result = 0;
        for (int i = 0; (int) Math.pow(2, i) <= pnum; i++) {
            result = (int) Math.pow(2, i);
        }
        return result;
    }
}

```

### Response:
```python
import sys

def count(pnum):
    result = 0
    i = 0
    while 2 ** i <= pnum:
        result = 2 ** i
        i += 1
    return result

def main():
    pnum = int(sys.stdin.readline().strip())
    print(count(pnum))

if __name__ == "__main__":
    main()
```

In this Python code, the `count` function is equivalent to the `count` method in the Java code. It calculates the largest power of 2 that is less than or equal to the input number `pnum`. The `main` function reads the input number from the standard input, calls the `count` function with this number, and prints the result. The `if __name__ == "__main__":` line ensures that the `main` function is only called when the script is run directly, not when it's imported as a module.
<|EOT|>
