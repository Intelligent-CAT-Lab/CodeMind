<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    for line in sys.stdin:
        line = line.strip()
        output = ""
        for char in line:
            if char.islower():
                output += char.upper()
            else:
                output += char
        print(output)

if __name__ == "__main__":
    main()
```
This code uses the `sys` module to read from standard input and the `strip()` method to remove any trailing newlines from the input. It then iterates over each character in the input line and checks if it is a lowercase letter using the `islower()` method. If it is, it adds the uppercase version of the character to the output string using the `upper()` method. If it is not a lowercase letter, it adds the character as is to the output string. Finally, it prints the output string.

Note that this code assumes that the input is a single line of text. If the input contains multiple lines, you will need to modify the code to handle that case as well.</s>
