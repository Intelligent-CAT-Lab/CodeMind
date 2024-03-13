<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p02723{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    if(s.charAt(2)==s.charAt(3) && s.charAt(4) == s.charAt(5))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
```

@@ Response
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    
    if s[2] == s[3] and s[4] == s[5]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if the 3rd and 4th characters are the same as the 5th and 6th characters, and prints "Yes" if they are and "No" otherwise.<｜end▁of▁sentence｜>
