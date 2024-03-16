<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03609 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),t=scan.nextInt();
		if(x>t) {
			System.out.println(x-t);
		}
		else if(x<=t) {
			System.out.println("0");
		}

	}

}
```

@@ Response
```python
# Python code

# Python does not have a direct equivalent to Java's Scanner class,
# so we use the built-in function input() to get user input.
# The function int() is used to convert the input to an integer.

x = int(input())
t = int(input())

if x > t:
    print(x - t)
elif x <= t:
    print("0")
```

This Python code does the same thing as the Java code. It prompts the user to enter two integers, then it checks if the first integer is greater than the second. If it is, it prints the difference between the two. If it's not, it prints "0".<｜end▁of▁sentence｜>
