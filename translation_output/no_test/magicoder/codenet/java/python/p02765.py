<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02765 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n < 10){
            System.out.println(r+ (10 - n) * 100);
        
        }else{
            System.out.println(r);
        }
    }
}

```

@@ Response
```python
import sys

def main():
    n, r = map(int, sys.stdin.readline().split())
    if n < 10:
        print(r + (10 - n) * 100)
    else:
        print(r)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if the first integer is less than 10, and then prints a result based on the condition. If the first integer is less than 10, it adds the difference between 10 and the first integer multiplied by 100 to the second integer. If the first integer is not less than 10, it just prints the second integer.<｜end▁of▁sentence｜>
