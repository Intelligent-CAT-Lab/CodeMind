<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
class p03803 {
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if(a==1){
			if(b!=1){
				System.out.println("Alice");
			}
		}
		if(b==1){
			if(a!=1){
				System.out.println("Bob");
			}
		}
		 	
		if((a>b)&&(a!=1)&&(b!=1)) System.out.println("Alice");
		if((a<b)&&(a!=1)&&(b!=1)) System.out.println("Bob");
		if(a==b) System.out.println("Draw");
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a == 1 and b != 1:
    print("Alice")
elif b == 1 and a != 1:
    print("Bob")
elif a > b and a != 1 and b != 1:
    print("Alice")
elif a < b and a != 1 and b != 1:
    print("Bob")
else:
    print("Draw")
```
Note: The `map` function is used to convert the input from strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input into two integers.</s>
