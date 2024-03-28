<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
2


```
import java.util.*;
import java.util.ArrayList;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

@@ Response
```python
import sys

def count_ones(n):
    s = ""
    while n > 0:
        x = n % 2
        n = n // 2
        s += str(x) + " "
    ans = 0
    for i in range(len(s)):
        if s[i] == '1':
            ans += 1
    return ans

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    print(count_ones(n))
```

In this Python code, we define a function `count_ones` that takes an integer `n` as input and returns the number of ones in its binary representation. The binary representation of `n` is calculated by repeatedly dividing `n` by 2 and taking the remainder. The remainders are then concatenated into a string `s`. The number of ones in `s` is then counted and returned.

The `if __name__ == "__main__":` block is used to read the input from the standard input (usually the console) and call the `count_ones` function with the input. The result is then printed to the standard output.<｜end▁of▁sentence｜>
