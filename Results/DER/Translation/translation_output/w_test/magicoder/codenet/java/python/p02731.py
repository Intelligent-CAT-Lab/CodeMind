<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1.000000000000


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

L = int(input())
print(math.pow(L/3, 3))
```

In this Python code, we use the `input()` function to get the input from the user. The `int()` function is used to convert the input string to an integer. Then, we use the `math.pow()` function to calculate the cube of the division of `L` by 3. The result is then printed out.<｜end▁of▁sentence｜>
