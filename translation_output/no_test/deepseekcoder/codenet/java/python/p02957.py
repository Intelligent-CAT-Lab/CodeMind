<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02957 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		long k = a + b;
		if (k % 2 == 0)
			System.out.println(k / 2);
		else
			System.out.println("IMPOSSIBLE");
		in.close();
	}
}

```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    k = a + b
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, adds them together, and then checks if the sum is even or odd. If it's even, it prints the sum divided by 2. If it's odd, it prints "IMPOSSIBLE".
<|EOT|>
