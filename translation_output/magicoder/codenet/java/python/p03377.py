<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
# Python code

# importing the required module
import sys

# reading input from user
a = int(input())
b = int(input())
x = int(input())

# checking the condition
if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if the sum of the first two integers is greater than or equal to the third integer and if the first integer is less than or equal to the third integer, and prints "YES" if the condition is true, otherwise it prints "NO".<｜end▁of▁sentence｜>
