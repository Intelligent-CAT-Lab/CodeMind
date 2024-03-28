<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

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

This Python code reads lines from the standard input (stdin), converts each line to uppercase using the `convert_to_uppercase` function, and then prints the result. The `strip` function is used to remove the newline character at the end of each line.<｜end▁of▁sentence｜>
