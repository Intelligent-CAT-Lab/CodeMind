<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
def reverse_string(input_string):
    return input_string[::-1]

if __name__ == "__main__":
    input_string = input()
    print(reverse_string(input_string))
```

This Python code defines a function `reverse_string` that takes a string as input and returns the reversed string. The `[::-1]` slice is a quick and easy way to reverse a string in Python.

The `if __name__ == "__main__":` block is a common idiom in Python to make sure the code inside it only runs when the script is run directly, not when it's imported as a module.

The `input()` function is used to read a line of input from the user. The `print()` function is used to output the result.<｜end▁of▁sentence｜>
