<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    print(factorial(n))
```

In this Python code, we define a recursive function `factorial` to calculate the factorial of a number. The function takes an integer `n` as input and returns the factorial of `n`. If `n` is 0, the function returns 1 (since the factorial of 0 is 1). Otherwise, the function returns `n` multiplied by the factorial of `n-1`.

The main part of the code reads an integer from the standard input, calls the `factorial` function with this integer as argument, and prints the result.
<|EOT|>
