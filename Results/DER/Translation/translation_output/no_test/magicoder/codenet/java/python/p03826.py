<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03826 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
		System.out.println((a<b)?b:a);
		sc.close();
	}
}
```

@@ Response
```python
# Python code

# importing the required module
import sys

# reading input from user
a = int(input()) * int(input())
b = int(input()) * int(input())

# printing the maximum value
print(max(a, b))
```

This Python code does the same thing as the Java code. It reads two integers from the user, multiplies them, and then prints the larger of the two results.<｜end▁of▁sentence｜>
