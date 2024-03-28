<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4 2

Expected output:
5 3


```
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class p03228
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int op = sc.nextInt();
	    
	    for(int i=0; i<op; i++){
	        if ( i % 2 == 0 ){ b += a / 2 ; a /= 2 ;}
	        else{
	          a += b / 2 ;
	          b /= 2 ;  
	        } 
	    }
	    System.out.println(a);
	    System.out.println(b);
	}
}

```

@@ Response
```python
# Python code

# Get input from user
a, b, op = map(int, input().split())

for i in range(op):
    if i % 2 == 0:
        b += a // 2
        a //= 2
    else:
        a += b // 2
        b //= 2

print(a)
print(b)
```

This Python code does the same thing as the Java code. It reads three integers from the user, then performs the specified number of operations. The operations are performed in a loop, where the value of `a` is divided by 2 and added to `b` if the current iteration is even, and the value of `b` is divided by 2 and added to `a` if the current iteration is odd. Finally, it prints the values of `a` and `b`.<｜end▁of▁sentence｜>
