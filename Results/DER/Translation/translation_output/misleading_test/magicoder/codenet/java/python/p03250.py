<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 5 2

Expected output:
49

```
import java.util.Scanner;

public class p03250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String StringA = String.valueOf(a);
		String StringB = String.valueOf(b);
		String StringC = String.valueOf(c);
		
		if (a >= b && a >= c) {
			if (b  >= c) {
				System.out.println(Integer.parseInt(StringA + StringB)+ c);
			} else  {
				System.out.println(Integer.parseInt(StringA + StringC)+ b);
			}
		} else if (b>=a && b >= c){
			if (a>=c) {
				System.out.println(Integer.parseInt(StringB + StringA) + c);
			} else {
				System.out.println(Integer.parseInt(StringB + StringC)+a);	
			}
		} else {
			if(a>= b) {
				System.out.println(Integer.parseInt(StringC + StringA)+b);
			} else {
				System.out.println(Integer.parseInt(StringC + StringB)+a);
			}
		}

	}
}

```

@@ Response
```python
# Python code

# Get input from user
a, b, c = map(int, input().split())

# Convert integers to strings
StringA = str(a)
StringB = str(b)
StringC = str(c)

# Check conditions and print result
if a >= b and a >= c:
    if b >= c:
        print(int(StringA + StringB) + c)
    else:
        print(int(StringA + StringC) + b)
elif b >= a and b >= c:
    if a >= c:
        print(int(StringB + StringA) + c)
    else:
        print(int(StringB + StringC) + a)
else:
    if a >= b:
        print(int(StringC + StringA) + b)
    else:
        print(int(StringC + StringB) + a)
```

This Python code does the same thing as the Java code. It takes three integers as input, converts them to strings, and then checks the conditions to print the result.<｜end▁of▁sentence｜>
