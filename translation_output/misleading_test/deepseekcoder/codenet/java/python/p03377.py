<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 4

Expected output:
!)'

```
import java.util.Scanner;
public class p03377{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         int b=s.nextInt();
         int x=s.nextInt();
         if(a+b>=x&&a<=x){
             System.out.println("YES");
         }
        
         else
         System.out.println("NO");
        
     }
}
```

### Response:
```python
def p03377():
    a, b, x = map(int, input().split())
    if a + b >= x and a <= x:
        print("YES")
    else:
        print("NO")

p03377()
```

In this Python code, we define a function `p03377()` that reads three integers from the input, checks if the sum of the first two integers is greater than or equal to the third integer and if the first integer is less than or equal to the third integer, and prints "YES" if both conditions are met, otherwise it prints "NO". We then call this function.
<|EOT|>
