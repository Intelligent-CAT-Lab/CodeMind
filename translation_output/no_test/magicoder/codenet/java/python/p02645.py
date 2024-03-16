<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    print(s[:3])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from standard input (sys.stdin.readline().strip() is equivalent to sc.next() in Java), and then prints the first three characters of that line (s[:3] is equivalent to s.substring(0,3) in Java).<｜end▁of▁sentence｜>
