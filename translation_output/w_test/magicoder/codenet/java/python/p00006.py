<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
w32nimda

Expected output:
admin23w


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

@@ Response
```python
import sys

def reverse_string(input_string):
    return input_string[::-1]

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(reverse_string(input_string))
```

In this Python code, we define a function `reverse_string` that takes a string as input and returns the reversed string. We then read the input string from the standard input (sys.stdin), strip any trailing newline characters, and pass it to the `reverse_string` function. The result is then printed to the standard output.<｜end▁of▁sentence｜>
