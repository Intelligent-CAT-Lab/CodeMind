<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614890


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

### Response:
```python
import sys

def solve(N, A, B):
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    return base * A + mod

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    print(solve(N, A, B))

if __name__ == "__main__":
    main()
```

In this Python code, we define a function `solve()` that takes three arguments: `N`, `A`, and `B`. This function calculates the base and modulus of `N` divided by `A + B`, and if the modulus is greater than or equal to `A`, it sets the modulus to `A`. It then returns the product of the base and `A` plus the modulus.

The `main()` function reads the input from the standard input, converts it to integers, and calls `solve()` with these values. The result is printed to the standard output.

The `if __name__ == "__main__":` line ensures that `main()` is only called if this script is run directly, not if it is imported as a module.
<|EOT|>
