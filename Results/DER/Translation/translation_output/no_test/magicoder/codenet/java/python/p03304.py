<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    d = int(sys.stdin.readline())

    s = d if d == 0 else (n - d) * 2
    print(float(s)/n/n*(m-1))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates a value `s` based on the input, and then prints the result of a calculation involving `s`, `n`, and `m`.<｜end▁of▁sentence｜>
