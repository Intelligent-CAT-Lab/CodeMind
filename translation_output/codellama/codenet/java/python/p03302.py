<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03302{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	if(a+b==15){
        	System.out.println("+");
        }else if(a*b==15){
        	System.out.println("*");
        }else{
        	System.out.println("x");
        }
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a + b == 15:
    print("+")
elif a * b == 15:
    print("*")
else:
    print("x")
```
Note: The `map` function is used to convert the input from a string to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` function is used to split the input into two integers.</s>
