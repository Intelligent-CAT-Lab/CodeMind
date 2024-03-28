<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2017/01/07

Expected output:
201801/07

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
Here is the Python equivalent of the given Java code:

```python
# Python code

def main():
    # Get input from user
    S = input()

    # Print the year and the rest of the string
    print('2018' + S[4:])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It gets a string input from the user, and then prints the string with '2018' prepended to it. The `[4:]` slice is used to get the substring from the 5th character to the end of the string.<｜end▁of▁sentence｜>
