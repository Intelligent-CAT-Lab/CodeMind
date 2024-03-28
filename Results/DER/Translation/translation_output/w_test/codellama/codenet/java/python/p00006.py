<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

def main():
    input_str = sys.stdin.readline().strip()
    output_str = ""
    for i in range(len(input_str)):
        output_str += input_str[len(input_str) - i - 1]
    print(output_str)

if __name__ == "__main__":
    main()
```
This code uses the `sys` module to read input from stdin, and the `strip()` method to remove any trailing newline characters. It then iterates over the input string and appends each character to the output string in reverse order. Finally, it prints the output string to stdout.</s>
