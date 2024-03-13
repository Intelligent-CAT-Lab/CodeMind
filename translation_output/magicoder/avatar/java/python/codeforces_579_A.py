<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    n = int(sys.stdin.readline())
    s = ""
    
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "
    
    ans = 0
    
    for i in range(len(s)):
        if s[i] == '1':
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, converts it to binary, and then counts the number of 1's in the binary representation.<｜end▁of▁sentence｜>
