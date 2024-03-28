<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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
        print(("0" if a[i]==0 else ("+" if a[i]>0 else "-"))+("" if i==0 else ""), end="")
    print()

p00301()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, converts it to a base 3 number, and then prints the base 3 representation. The difference is that Python uses `//` for integer division and `print` has a `end` parameter to control the newline character.
<|EOT|>
