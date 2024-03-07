<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

def main():
    for line in sys.stdin:
        line = line.strip()
        if not line:
            break
        print(line.upper())

if __name__ == "__main__":
    main()
```
This code reads lines from standard input using the `sys.stdin` object, and then converts each line to uppercase using the `upper()` method. The `strip()` method is used to remove any trailing whitespace from the line. The `if not line:` check is used to break out of the loop when the input is empty. Finally, the `print()` function is used to print the uppercase line to standard output.</s>
