<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
120


```
import java.util.*;

public class p00019 {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		//calculation
		Long ans = 1L;
		for(Long N = sc.nextLong();N>1;N--){
			ans *= N;
		}
		//output
		System.out.println(ans);
	}
}
```

@@ Response
```python
#input
N = int(input())

#calculation
ans = 1
for i in range(N, 1, -1):
    ans *= i

#output
print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the factorial of that number, and then prints the result. The factorial of a number is the product of all positive integers less than or equal to the number. For example, the factorial of 5 (denoted as 5!) is 5*4*3*2*1 = 120.<｜end▁of▁sentence｜>
