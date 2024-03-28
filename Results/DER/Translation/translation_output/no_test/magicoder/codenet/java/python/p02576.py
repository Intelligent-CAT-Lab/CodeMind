<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}
```

@@ Response
```python
import sys

def main():
    n, x, t = map(int, sys.stdin.readline().split())
    ans = 0
    tako = 0
    while n > tako:
        ans += t
        tako += x
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the sum of `t` for as long as `n` is greater than `tako`, and then prints the result.<｜end▁of▁sentence｜>
