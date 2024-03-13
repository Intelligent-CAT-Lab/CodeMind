<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the price of the product, and prints the result. The `//` operator in Python is used for integer division, which is equivalent to the `/` operator in Java but rounds down to the nearest integer.<｜end▁of▁sentence｜>
