<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class atcoder_ABC158_B:
    def __init__(self):
        self.N = 0
        self.A = 0
        self.B = 0

    def run(self):
        self.N = int(sys.stdin.readline().strip())
        self.A = int(sys.stdin.readline().strip())
        self.B = int(sys.stdin.readline().strip())
        base = self.N // (self.A + self.B)
        mod = self.N % (self.A + self.B)
        if mod >= self.A:
            mod = self.A
        print(base * self.A + mod)
        return

if __name__ == "__main__":
    atcoder_ABC158_B().run()
```
<|EOT|>
