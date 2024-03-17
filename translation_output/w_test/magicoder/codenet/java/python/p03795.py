<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())
    print((n * 800) - ((n // 15) * 200))

if __name__ == "__main__":
    main()
```

In Python, the equivalent code would be:

1. Import the `sys` module to read from standard input.
2. Define a `main` function to read the input, perform the calculation, and print the result.
3. Call the `main` function when the script is run.<｜end▁of▁sentence｜>
