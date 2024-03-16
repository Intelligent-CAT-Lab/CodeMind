<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    if n % k == 0:
        print(0)
    else:
        print(1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if the first integer is divisible by the second one, and prints 0 if it is, or 1 otherwise.<｜end▁of▁sentence｜>
