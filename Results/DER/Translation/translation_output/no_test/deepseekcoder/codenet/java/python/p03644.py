<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import math

def count(pnum):
    result = 0
    i = 0
    while math.pow(2, i) <= pnum:
        result = int(math.pow(2, i))
        i += 1
    return result

def main():
    pnum = int(sys.stdin.readline().strip())
    print(count(pnum))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, passes it to the `count` function, and then prints the result. The `count` function calculates the largest power of 2 that is less than or equal to the input number.
<|EOT|>
