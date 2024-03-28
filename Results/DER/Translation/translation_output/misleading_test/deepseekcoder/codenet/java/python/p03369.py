<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxo

Expected output:
977

```
import java.util.Scanner;

public class p03369 {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();

        System.out.println((s.length() - s.replace("o","").length())*100+700);
//        if (a<=x && a+b>=x) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
//        }


	}

	// æå­åã¨ãã¦å¥åãåå¾
	public static String gs() {
		return scanner.next();
	}

	// intã¨ãã¦å¥åãåå¾
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longã¨ãã¦å¥åãåå¾
	public static long gl() {
		return Long.parseLong(scanner.next());
	}
	
	// doubleã¨ãã¦å¥åãåå¾
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}
```

### Response:
```python
import sys

def gs():
    return sys.stdin.readline().strip()

def solve():
    s = gs()
    print((len(s) - s.count('o'))*100 + 700)

if __name__ == "__main__":
    solve()
```

In this Python code, we use `sys.stdin.readline().strip()` to read the input string. The `gs()` function is equivalent to the `gs()` function in the Java code. The `solve()` function is equivalent to the `main()` function in the Java code. The `if __name__ == "__main__":` line is used to call the `solve()` function when the script is run directly.
<|EOT|>
