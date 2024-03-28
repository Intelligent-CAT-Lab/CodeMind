<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 4

Expected output:
-86

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

In the Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. The `min(n % k, k - (n % k))` function is used to find the minimum of the remainder of `n` divided by `k` and `k` minus the remainder of `n` divided by `k`. The `print(ans)` function is used to print the result.<｜end▁of▁sentence｜>
