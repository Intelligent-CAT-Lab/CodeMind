<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
// 0306
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}

```

@@ Response
Here is the equivalent Python code:

```python
# 0306
def p00301():
    n = int(input())
    a = [0]*15
    i = 0
    while n > 0:
        a[i] = (n+1)%3-1
        n = (n-a[i])//3
        i += 1
    while i > 0:
        i -= 1
        print(('0' if a[i]==0 else ('+' if a[i]>0 else '-')) + ('\n' if i==0 else ''), end='')

p00301()
```

This Python code does the same thing as the Java code. It reads an integer from the user, converts it to a base-3 number, and then prints out the digits of the base-3 number. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
