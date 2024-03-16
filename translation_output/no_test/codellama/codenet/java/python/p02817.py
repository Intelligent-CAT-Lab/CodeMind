<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String tString = in.next();
		System.out.println(tString + string);
		in.close();
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

string = sys.stdin.readline().strip()
t_string = sys.stdin.readline().strip()
print(t_string + string)
```
In this code, we use the `sys` module to read input from the standard input stream. The `readline()` method reads a line of input from the stream and the `strip()` method removes any leading or trailing whitespace from the line. We then concatenate the two strings and print the result.</s>
