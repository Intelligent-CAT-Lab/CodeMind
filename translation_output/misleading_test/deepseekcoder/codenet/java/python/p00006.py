<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
w32nimda

Expected output:
admin23wn

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00006 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String ret = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(str.length() - i - 1);
			ret += ch;
		}
		System.out.println(ret);
	}
}
```

### Response:
```python
import sys

def reverse_string(s):
    return s[::-1]

if __name__ == "__main__":
    str = sys.stdin.readline().strip()
    print(reverse_string(str))
```

In this Python code, we define a function `reverse_string` that takes a string as input and returns the reversed string. We use Python's slicing syntax to reverse the string. The `strip` function is used to remove the newline character at the end of the input. The `if __name__ == "__main__":` line is used to run the code only when the script is run directly, not when it's imported as a module.
<|EOT|>
