<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class p03387 {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] x=new int[3];
x[0]=sc.nextInt();
x[1]=sc.nextInt();
x[2]=sc.nextInt();
Arrays.sort(x);
int temp=2*x[2]-x[1]-x[0];
int ans;
if(temp%2==1){ans=(temp+2)/2+1;}else{ans=temp/2;}
out.println(ans);
}}
```

@@ Response
Here is the equivalent Python code:

```python
import sys
import math

def main():
    x = [int(i) for i in input().split()]
    x.sort()
    temp = 2 * x[2] - x[1] - x[0]
    ans = temp // 2 if temp % 2 == 0 else (temp + 2) // 2 + 1
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, sorts them, calculates a temporary value, and then calculates the final answer. The final answer is printed to the standard output.<｜end▁of▁sentence｜>
