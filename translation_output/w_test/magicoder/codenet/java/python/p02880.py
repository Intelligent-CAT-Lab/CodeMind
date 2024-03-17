<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
Yes


```
import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f ? "Yes" : "No";
		System.out.println(ret);
	}
}

```

@@ Response
```python
N = int(input())
f = False
for A in range(1, 10):
    if N % A == 0 and N // A < 10:
        f = True
ret = "Yes" if f else "No"
print(ret)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it can be divided by a number from 1 to 9 and the result is less than 10, and if so, sets the flag `f` to `True`. Then it prints "Yes" if `f` is `True`, otherwise it prints "No".<｜end▁of▁sentence｜>
