<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```

### Response:
```python
import sys

def main():
    print("ABC" if int(sys.stdin.readline()) < 1200 else "ARC")

if __name__ == '__main__':
    main()
```

In Python, we don't need to import the Scanner class from java.util package. Instead, we use the sys.stdin.readline() function to read the input from the standard input. The ternary operator is also used in a similar way in Python.
<|EOT|>
