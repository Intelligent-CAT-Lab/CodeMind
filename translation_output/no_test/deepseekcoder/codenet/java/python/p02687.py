<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class p02687 {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		String s = sc.next();
		sc.close();
		out.println(s.equals("ABC")?"ARC":"ABC");
	}
}

```

### Response:
```python
import sys

MOD = 1000000007

def main():
    s = sys.stdin.readline().strip()
    print("ARC" if s == "ABC" else "ABC")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if it is "ABC", and prints "ARC" if it is, otherwise it prints "ABC".
<|EOT|>
