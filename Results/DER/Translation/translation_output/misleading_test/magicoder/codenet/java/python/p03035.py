<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30 100

Expected output:
23

```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```

@@ Response
```python
# Python code

# Get input from user
a, b = map(int, input().split())

# Check conditions and print output
if a <= 5:
    print(0)
elif a <= 12:
    print(b // 2)
else:
    print(b)
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks the conditions and prints the output accordingly.<｜end▁of▁sentence｜>
