<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

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
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The rest of the code is similar to the Java code, with the only difference being that Python uses square brackets to access characters in a string, rather than the `.charAt()` method.</s>
