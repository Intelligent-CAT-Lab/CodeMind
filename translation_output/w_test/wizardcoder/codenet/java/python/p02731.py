Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

print(math.pow(L/3, 3))
```

Output:
```
1.0
```

Explanation:
In Python, we can use the `math` module to access mathematical functions. In this case, we are using the `pow()` function to calculate the cube root of `L/3`. The `math.pow()` function takes two arguments, the base and the exponent. In this case, the base is `L/3` and the exponent is `3`. The result is then printed to the console.<|endoftext|>
