<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def main():
    str = sys.stdin.readline().strip()
    ret = ""
    for i in range(len(str)):
        ch = str[len(str) - i - 1]
        ret += ch
    print(ret)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input (sys.stdin), reverses it, and then prints the reversed string.<｜end▁of▁sentence｜>
