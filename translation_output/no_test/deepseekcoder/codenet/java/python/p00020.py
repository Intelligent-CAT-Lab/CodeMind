<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
        if 97 <= ord(c) <= 123:
            t += chr(ord(c) - 32)
        else:
            t += c
    return t

for line in sys.stdin:
    print(convert_to_uppercase(line.strip()))
```

This Python code does the same thing as the Java code. It reads lines from the standard input, converts each line to uppercase, and prints the result. The `convert_to_uppercase` function takes a string and returns a new string where all lowercase letters have been converted to uppercase. The `for` loop at the end of the code reads lines from the standard input and calls `convert_to_uppercase` on each line. The `strip` method is used to remove the newline character at the end of each line.
<|EOT|>
