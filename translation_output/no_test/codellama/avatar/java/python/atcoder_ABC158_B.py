<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

N, A, B = map(int, sys.stdin.readline().split())
base = N // (A + B)
mod = N % (A + B)
if mod >= A:
    mod = A
print(base * A + mod)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to a list of integers, and the `//` operator is used for integer division. The `if` statement is used to check if the modulus is greater than or equal to `A`, and if it is, the modulus is set to `A`. Finally, the result is printed to the console.</s>
