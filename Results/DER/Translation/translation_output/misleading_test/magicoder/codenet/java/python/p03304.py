<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-41.43905052660632

```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0 ? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    n, m, d = map(int, sys.stdin.readline().split())
    s = d if d == 0 else (n - d) * 2
    print(s / n / n * (m - 1))

if __name__ == "__main__":
    main()
```

This Python code reads the input from the standard input (sys.stdin), splits it into three integers, and then calculates the value of `s` as per the Java code. It then prints the result of the calculation.<｜end▁of▁sentence｜>
