<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    line = sys.stdin.readline().strip()
    length = len(line)
    print(line[:length-8])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from standard input, calculates the length of the line, and then prints the line minus the last 8 characters.<｜end▁of▁sentence｜>
