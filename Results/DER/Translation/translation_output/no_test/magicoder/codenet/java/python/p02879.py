<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p02879 {
    public static void main(String[] args) {
        p02879 main = new p02879();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (9 < A || 9 < B) {
            System.out.println(-1);
            return;
        }
        System.out.println(A * B);
    }
}

```

@@ Response
```python
import sys

class p02879:
    def __init__(self):
        self.A = 0
        self.B = 0

    def solve(self):
        self.A, self.B = map(int, sys.stdin.readline().split())
        if 9 < self.A or 9 < self.B:
            print(-1)
            return
        print(self.A * self.B)

if __name__ == "__main__":
    main = p02879()
    main.solve()
```

In this Python code, we use the `sys.stdin.readline()` function to read input from the standard input (console). The `map()` function is used to convert the input string into integers. If the input numbers are greater than 9, it prints -1. Otherwise, it multiplies the numbers and prints the result.<｜end▁of▁sentence｜>
