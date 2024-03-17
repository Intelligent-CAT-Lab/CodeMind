Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 2

Expected output:
2


```
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class p02970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		final int D = Integer.parseInt(sc.next());

		BigDecimal ans = BigDecimal.valueOf(N / (D * 2 + 1.0));
		ans =  ans.setScale(0, RoundingMode.CEILING);
		System.out.println(ans);


	}

}

```

### Response:
```python
import math

N, D = map(int, input().split())

ans = math.ceil(N / (D * 2 + 1))

print(ans)
```

Explanation:

- We first import the `math` module to use the `ceil()` function.
- We read the input values of `N` and `D` using the `input()` function and convert them to integers using the `map()` function.
- We calculate the value of `ans` using the formula `ans = math.ceil(N / (D * 2 + 1))`.
- We print the value of `ans` using the `print()` function.<|endoftext|>
