<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03206 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int D=stdIn.nextInt();
		if(D==25)
			System.out.println("Christmas");
		if(D==24)
			System.out.println("Christmas Eve");
		if(D==23)
			System.out.println("Christmas Eve Eve");
		if(D==22)
			System.out.println("Christmas Eve Eve Eve");
	}
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

D = int(sys.stdin.readline())

if D == 25:
    print("Christmas")
elif D == 24:
    print("Christmas Eve")
elif D == 23:
    print("Christmas Eve Eve")
elif D == 22:
    print("Christmas Eve Eve Eve")
```
Note: The `sys` module is used to read input from the standard input stream, and the `int` function is used to convert the input string to an integer. The `readline` method is used to read a line of input from the standard input stream, and the `print` function is used to print the output to the standard output stream.</s>
