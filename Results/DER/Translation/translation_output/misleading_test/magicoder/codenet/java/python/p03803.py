<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 6

Expected output:
zp?L_

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

# Read input from user
a, b = map(int, input().split())

# Check conditions and print output
if a == 1:
    if b != 1:
        print("Alice")
elif b == 1:
    if a != 1:
        print("Bob")
elif (a > b) and (a != 1) and (b != 1):
    print("Alice")
elif (a < b) and (a != 1) and (b != 1):
    print("Bob")
elif a == b:
    print("Draw")
```

This Python code does the same thing as the Java code. It reads two integers from the user, and then checks the conditions to determine the output. The output is then printed to the console.<｜end▁of▁sentence｜>
