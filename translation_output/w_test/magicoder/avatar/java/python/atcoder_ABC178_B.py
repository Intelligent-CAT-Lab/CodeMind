<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
418379342 802780784 -790013317 -445130206

Expected output:
-186233282690604452


```
import java.util.*;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        System.out.println(Math.max(Math.max(Math.max(a * c, b * d), a * d), b * c));
    }
}
```

@@ Response
```python
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    print(max(a*c, b*d, a*d, b*c))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the console. The `map()` function is used to convert the input string into integers. The `max()` function is used to find the maximum of the four possible products.<｜end▁of▁sentence｜>
