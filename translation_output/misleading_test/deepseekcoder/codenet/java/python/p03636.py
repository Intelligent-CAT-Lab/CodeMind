<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
.18n

```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    leng = len(s)
    print(s[0], leng-2, s[leng-1], sep='')

if __name__ == "__main__":
    main()
```

In this Python code, we use `sys.stdin.readline().strip()` to read the input string. The `len()` function is used to get the length of the string. The `print()` function is used to print the output, with the `sep=''` argument to prevent a space between the printed elements.
<|EOT|>
