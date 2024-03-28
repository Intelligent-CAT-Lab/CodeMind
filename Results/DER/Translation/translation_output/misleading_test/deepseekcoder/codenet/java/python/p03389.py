<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
-74

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
def solve(A, B, C):
    M = max(A, max(B, C))

    if (A+B+C)%2 == M%2:
        return (3*M-(A+B+C))//2
    else:
        return ((3*M+3)-(A+B+C))//2

A, B, C = map(int, input().split())
print(solve(A, B, C))
```

In this Python code, we define a function `solve()` that takes three arguments A, B, and C. The function calculates the maximum value among A, B, and C and checks if the sum of A, B, and C is even or odd. If the sum is even, it returns the result of `(3*M-(A+B+C))/2`. If the sum is odd, it returns the result of `((3*M+3)-(A+B+C))/2`.

The inputs are read from the standard input using the `input().split()` function, which splits the input into a list of strings. The `map()` function is used to convert each string in the list to an integer. The results are printed to the standard output using the `print()` function.
<|EOT|>
