<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1024

Expected output:
2020


```
import java.util.Scanner;

public class p02724 {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			int gohyaku = X/500;
			
			X = X-500*gohyaku;
			
			int goen = X/5;
			
			
			System.out.println(1000*gohyaku+5*goen);
		}
		
		
	}
		

}

```

@@ Response
```python
# Python code

X = int(input())

gohyaku = X//500

X = X-500*gohyaku

goen = X//5

print(1000*gohyaku+5*goen)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the number of 500-yen bills and 5-yen coins, and then prints the total amount.<｜end▁of▁sentence｜>
