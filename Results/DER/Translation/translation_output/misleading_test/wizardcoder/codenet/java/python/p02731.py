Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

L = int(input())

print(math.pow(L/3, 3))
```

Explanation:

- We first import the `math` module to use the `pow()` function.
- We then take the input as an integer using the `input()` function and store it in the variable `L`.
- We then use the `pow()` function to calculate the cube root of `L/3` and store it in the variable `result`.
- Finally, we print the value of `result` using the `print()` function.<|endoftext|>
