<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print((a + b) / 2)

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input strings to integers, and the `split` method is used to split the input string into two parts. The `readline` method is used to read a line from the standard input, and the `print` function is used to print the result. The `if __name__ == "__main__":` block is used to ensure that the `main` function is only executed when the script is run as a standalone program, and not when it is imported as a module.</s>
