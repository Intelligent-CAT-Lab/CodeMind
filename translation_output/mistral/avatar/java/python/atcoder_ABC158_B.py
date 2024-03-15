<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

class Solver:
    def run(self):
        N, A, B = map(int, sys.stdin.readline().split())
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        print(base * A + mod)

if __name__ == '__main__':
    Solver().run()
```</s>
