<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
200

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
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    print(factorial(n))
```

In this Python code, we define a function `factorial(n)` that calculates the factorial of a number `n`. The function uses a for loop to multiply all the numbers from 1 to `n` (inclusive) together. The result is then returned. The main part of the code reads an integer from the standard input, calls the `factorial` function with this number as argument, and prints the result.
<|EOT|>
