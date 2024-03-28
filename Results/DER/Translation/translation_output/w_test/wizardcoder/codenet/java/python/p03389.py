Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
2


```
import java.util.Scanner;
public class p03389 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int M = Math.max(A, Math.max(B, C));

		if((A+B+C)%2 == M%2) {
			System.out.println((3*M-(A+B+C))/2);
		}else {
			System.out.println(((3*M+3)-(A+B+C))/2);
		}

	}

}

```

### Response:
```python
import math

A, B, C = map(int, input().split())

M = max(A, max(B, C))

if ((A+B+C) % 2 == M % 2):
    print((3*M-(A+B+C))/2)
else:
    print(((3*M+3)-(A+B+C))/2)
```

Explanation:

- We first import the `math` module to use the `max()` function.
- We take input from the user using the `input()` function and split it into three variables `A`, `B`, and `C`.
- We find the maximum value of `A`, `B`, and `C` using the `max()` function and store it in the variable `M`.
- We check if the sum of `A`, `B`, and `C` is even or odd using the modulo operator `%`. If it is even, we print the value of `3M - (A+B+C)/2`. If it is odd, we print the value of `(3M+3) - (A+B+C)/2`.<|endoftext|>
