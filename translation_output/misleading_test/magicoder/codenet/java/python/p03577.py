<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CUODE

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
Here is the Python equivalent of the given Java code:

```python
import sys

def main():
    line = sys.stdin.readline().strip()
    print(line[:-8])

if __name__ == "__main__":
    main()
```

This Python code reads a line from the standard input (sys.stdin), strips any trailing newline characters, and then prints the substring of the line from the beginning to the 8th to last character.<｜end▁of▁sentence｜>
