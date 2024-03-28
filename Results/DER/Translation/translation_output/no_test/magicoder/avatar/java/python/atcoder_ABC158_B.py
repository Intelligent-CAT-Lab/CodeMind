<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC158_B {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {
    public void run() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long base = N / (A + B);
        long mod = N % (A + B);
        if (mod >= A)
            mod = A;
        System.out.println(base * A + mod);
        return;
    }
}
```

@@ Response
```python
class Solver:
    def run(self):
        N, A, B = map(int, input().split())
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        print(base * A + mod)
        return

if __name__ == "__main__":
    Solver().run()
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the base and modulus, and then prints the result. The `map(int, input().split())` line is equivalent to `sc.nextLong()` in the Java code. The `//` operator is used for integer division in Python, and the `%` operator is used for modulus. The `if` statement is used to ensure that the modulus is not greater than `A`. The `print` statement is used to output the result.<｜end▁of▁sentence｜>
