<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;
import java.math.*;
 
public class p02719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = Math.min(n%k, k-(n%k));
        System.out.println(ans);
    }

}
```

@@ Response
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    ans = min(n % k, k - (n % k))
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the minimum of the remainder of the division of `n` by `k` and `k` minus the remainder of the division of `n` by `k`, and then prints the result.<｜end▁of▁sentence｜>
