<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```

@@ Response
```python
import sys

def main():
    r, g, b = map(int, sys.stdin.readline().split())
    r *= 100
    g *= 10
    sum = r + g + b
    print("YES" if sum % 4 == 0 else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, multiplies the first two by 100 and 10 respectively, adds them up, and then checks if the sum is divisible by 4. If it is, it prints "YES", otherwise it prints "NO".<｜end▁of▁sentence｜>
