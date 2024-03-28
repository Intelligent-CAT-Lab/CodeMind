<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for i in range(len(input_string)):
        output_string += input_string[len(input_string) - i - 1]
    print(output_string)

if __name__ == "__main__":
    main()
```
This code reads a string from standard input using the `sys.stdin.readline()` method, and then reverses the string using a for loop. The reversed string is then printed to the console using the `print()` function.

Note that in Python, the `readline()` method returns a string that includes the newline character at the end, so we need to use the `strip()` method to remove the newline character before reversing the string.</s>
