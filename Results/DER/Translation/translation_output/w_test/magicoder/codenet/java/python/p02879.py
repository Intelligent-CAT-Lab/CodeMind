<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


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

def solve():
    A, B = map(int, sys.stdin.readline().split())
    if 9 < A or 9 < B:
        print(-1)
        return
    print(A * B)

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if they are less than 10, and if so, it multiplies them and prints the result. If not, it prints -1.<｜end▁of▁sentence｜>
