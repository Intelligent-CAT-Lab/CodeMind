<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
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
```

@@ Response
```python
# Python code

# importing the required module
import sys

# reading input from user
a = int(input())
b = int(input())

# checking conditions
if a == 1:
    if b != 1:
        print("Alice")

if b == 1:
    if a != 1:
        print("Bob")

if (a > b) and (a != 1) and (b != 1):
    print("Alice")

if (a < b) and (a != 1) and (b != 1):
    print("Bob")

if a == b:
    print("Draw")
```

This Python code does the same thing as the Java code you provided. It reads two integers from the user, and then checks a series of conditions to determine who wins or if it's a draw.<｜end▁of▁sentence｜>
