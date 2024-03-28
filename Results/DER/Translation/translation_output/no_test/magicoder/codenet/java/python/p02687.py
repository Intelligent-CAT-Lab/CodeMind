<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

class p02687:
    MOD = 1000000007

    def main(self):
        s = sys.stdin.readline().strip()
        print("ARC" if s == "ABC" else "ABC")

if __name__ == "__main__":
    p02687().main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if it's "ABC", and then prints "ARC" if it is, otherwise it prints "ABC".<｜end▁of▁sentence｜>
