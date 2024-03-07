<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, x = map(int, sys.stdin.readline().split())

if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")
```
In this code, we first import the `sys` module, which provides access to the standard input and output streams. We then use the `map` function to convert the input from the standard input stream into integers.

Next, we assign the values of `a`, `b`, and `x` to the corresponding variables.

Finally, we use an `if` statement to check if the sum of `a` and `b` is greater than or equal to `x` and if `a` is less than or equal to `x`. If both conditions are true, we print "YES" to the standard output stream. Otherwise, we print "NO".</s>
