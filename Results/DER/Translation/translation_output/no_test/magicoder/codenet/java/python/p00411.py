<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    a = float(sys.stdin.readline())
    t = float(sys.stdin.readline())
    r = float(sys.stdin.readline())
    print(r * t / a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three numbers from the standard input (which is usually the console), calculates the result as `r * t / a`, and then prints the result.<｜end▁of▁sentence｜>
