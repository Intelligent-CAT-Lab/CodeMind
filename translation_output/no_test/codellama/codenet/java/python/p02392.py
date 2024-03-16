<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02392 {

	public static void main(String[] args) throws Exception {
		String inStr;
		inStr = inp();
		String[] in;
		in = inStr.split(" ");

		int a = Integer.valueOf(in[0]);
		int b = Integer.valueOf(in[1]);
		int c = Integer.valueOf(in[2]);

		if (a < b && b < c)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static String inp() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    in_str = sys.stdin.readline().strip()
    in_list = in_str.split(" ")
    a, b, c = map(int, in_list)
    if a < b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `map` function is used to convert the input strings to integers. The rest of the code is similar to the Java code, with the exception of the `if` statement, which is written in a more Pythonic way using the `if` statement.</s>
