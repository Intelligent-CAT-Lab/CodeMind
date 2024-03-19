<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
5.4292616764836055

```
import java.util.Scanner;

public class p02731{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double L = scan.nextInt();
		scan.close();
		System.out.println(Math.pow(L/3, 3));
	}
}

```

@@ Response
```python
import math

L = float(input())
print(math.pow(L/3, 3))
```

In this Python code, we use the `input()` function to get the input from the user. The `float()` function is used to convert the input string to a floating-point number. Then, we use the `math.pow()` function to calculate the cube of the division of `L` by `3`. The result is then printed to the console.<｜end▁of▁sentence｜>
