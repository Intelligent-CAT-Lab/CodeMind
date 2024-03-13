<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
Here is the equivalent Python code:

```python
import math

L = int(input())
print(math.pow(L/3, 3))
```

In this Python code, we use the `input()` function to get the input from the user, which is equivalent to `scan.nextInt()` in Java. The `math.pow()` function is used to calculate the cube of the result of the division of `L` by `3`, which is equivalent to `Math.pow(L/3, 3)` in Java.<｜end▁of▁sentence｜>
