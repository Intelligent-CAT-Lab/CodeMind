<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import math

L = int(input())
print(round(math.pow(L/3, 3), 12))
```

In this Python code, we use the `input()` function to read the input from the user. The `math.pow()` function is used to calculate the cube of the result of `L/3`. The `round()` function is used to round the result to 12 decimal places.
<|EOT|>
