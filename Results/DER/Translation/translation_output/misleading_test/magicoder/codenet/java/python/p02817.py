<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
_atcoder

```
import java.util.Scanner;

public class p02817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String tString = in.next();
		System.out.println(tString + string);
		in.close();
	}
}
```

@@ Response
```python
# Python code

def main():
    string, tString = input().split()
    print(tString + string)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to read the input from the user. The `split()` function is used to split the input into two strings. The `+` operator is used to concatenate the two strings. The result is then printed to the console.<｜end▁of▁sentence｜>
