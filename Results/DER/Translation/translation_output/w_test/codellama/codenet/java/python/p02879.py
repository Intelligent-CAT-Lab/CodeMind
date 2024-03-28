<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def solve():
    A, B = map(int, sys.stdin.readline().split())
    if A > 9 or B > 9:
        print(-1)
    else:
        print(A * B)

if __name__ == "__main__":
    solve()
```
Note: The `sys` module is used to read input from stdin, and the `map` function is used to convert the input strings to integers. The `if` statement is used to check if either `A` or `B` is greater than 9, and if so, print -1. Otherwise, print the product of `A` and `B`.</s>
