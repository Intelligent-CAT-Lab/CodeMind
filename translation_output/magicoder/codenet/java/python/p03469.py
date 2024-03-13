<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03469 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

		  Scanner sc = new Scanner(System.in);
		  
		  String S = sc.nextLine();
		  char c [] = S.toCharArray();
		  
		  System.out.print(2018);
		 for(int i = 4; i <c.length;i++) {
			 System.out.print(c[i]);
		 }
		 

	}

}

```

@@ Response
Here is the equivalent Python code:

```python
# Python code

# importing the required module
import sys

# reading input from user
S = sys.stdin.readline().strip()

# printing 2018
print(2018)

# printing the rest of the string
for i in range(4, len(S)):
    print(S[i], end='')
```

This Python code does the same thing as the Java code. It reads a string from the user, prints the number 2018, and then prints the rest of the string. The `strip()` function is used to remove the newline character that `sys.stdin.readline()` reads. The `end=''` argument in the `print()` function is used to prevent a newline from being printed after each character.<｜end▁of▁sentence｜>
