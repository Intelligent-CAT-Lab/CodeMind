<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
# Python implementation of the given Java code

# Read input string from user
input_str = input()

# Initialize an empty string to store the output
output_str = ""

# Iterate over the characters in the input string in reverse order
for i in range(len(input_str)-1, -1, -1):
    # Append the current character to the output string
    output_str += input_str[i]

# Print the output string
print(output_str)
```</s>
