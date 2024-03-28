<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def solve():
    A, B = map(int, sys.stdin.readline().split())
    if A > 9 or B > 9:
        print(-1)
        return
    print(A * B)

if __name__ == "__main__":
    solve()
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `map` function is used to convert the input strings to integers. The rest of the code is similar to the Java code, with the exception of the `if` statement, which is written differently in Python.</s>
