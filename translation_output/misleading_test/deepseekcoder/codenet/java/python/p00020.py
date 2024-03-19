<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
this is a pen.

Expected output:
THIS IS A PEN. 

```
import java.io.*;

public class p00020 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String s,t;
		char c;
		while((s=bf.readLine())!=null){
			t="";for(int i=0,j=s.length();i<j;i++){c=s.charAt(i);t+=(char)((c>=97&&c<=123)?(c-32):(c));}
			System.out.println(t);
		}
	}
}
```

### Response:
```python
import sys

def convert_to_uppercase(s):
    t = ""
    for c in s:
        if 'a' <= c <= 'z':
            t += chr(ord(c) - 32)
        else:
            t += c
    return t

for line in sys.stdin:
    print(convert_to_uppercase(line.strip()))
```

This Python code reads lines from the standard input (stdin), converts them to uppercase using the `convert_to_uppercase` function, and then prints the result. The `convert_to_uppercase` function iterates over each character in the input string. If the character is a lowercase letter (between 'a' and 'z'), it converts it to uppercase by subtracting 32 from its ASCII value. If the character is not a lowercase letter, it leaves it unchanged.
<|EOT|>
