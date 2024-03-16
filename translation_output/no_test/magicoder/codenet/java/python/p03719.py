<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}

```

@@ Response
```python
import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    
    result = "No"
    if a <= c <= b:
        result = "Yes"
    
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, checks if the third integer is between the first and the second, and prints "Yes" if it is, and "No" otherwise.<｜end▁of▁sentence｜>
