<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4 2

Expected output:
5

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

### Response:
```python
import sys

def main():
    a, b, op = map(int, sys.stdin.readline().split())

    for i in range(op):
        if i % 2 == 0:
            b += a // 2
            a //= 2
        else:
            a += b // 2
            b //= 2

    print(a)
    print(b)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, performs the specified number of operations, and then prints the final values of `a` and `b`. The operations are performed in a loop, with the `a` value being halved and added to `b` if the loop index is even, and with the `b` value being halved and added to `a` if the loop index is odd.
<|EOT|>
