Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20

Expected output:
15800


```
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class p03795{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		int n;
		n = Integer.parseInt(reader.readLine());

		System.out.println((n * 800) - ((n / 15) * 200));

		reader.close();
	}
}
```

### Response:
```python
import sys

n = int(sys.stdin.readline().strip())

print((n * 800) - ((n // 15) * 200))
```

Explanation:

- We first import the `sys` module to read input from the command line.
- We read the input integer `n` from the command line using `sys.stdin.readline().strip()`.
- We calculate the result using the formula `(n * 800) - ((n // 15) * 200)` and print it to the console using `print()`.
- We close the input buffer using `reader.close()`.<|endoftext|>
