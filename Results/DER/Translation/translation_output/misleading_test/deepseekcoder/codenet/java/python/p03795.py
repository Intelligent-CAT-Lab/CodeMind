<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20

Expected output:
15706

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

def main():
    n = int(sys.stdin.readline())
    print((n * 800) - ((n // 15) * 200))

if __name__ == "__main__":
    main()
```

In the Python code, we use `sys.stdin.readline()` to read the input from the standard input (which is the same as the input from the console in Java). The `//` operator in Python is used for integer division, which is equivalent to the `/` operator in Java but it always returns an integer. The `print` function is used to output the result, which is equivalent to `System.out.println` in Java.
<|EOT|>
