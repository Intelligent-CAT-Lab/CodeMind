<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABC

Expected output:
ARC


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

def main():
    s = sys.stdin.readline().strip()
    if s == "ABC":
        print("ARC")
    else:
        print("ABC")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` function to read the input string. Then we use an if-else statement to check if the input string is "ABC". If it is, we print "ARC", otherwise we print "ABC".
<|EOT|>
