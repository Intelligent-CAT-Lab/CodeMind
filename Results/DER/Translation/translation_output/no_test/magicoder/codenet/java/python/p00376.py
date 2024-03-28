<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00376
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ans=Math.abs(a-b);

        System.out.println(ans);
    }
}

```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    ans = abs(a - b)

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the absolute difference between them, and then prints the result.<｜end▁of▁sentence｜>
