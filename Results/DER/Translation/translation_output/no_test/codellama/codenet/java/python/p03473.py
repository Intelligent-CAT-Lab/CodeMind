<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class p03473 {
	static int[] MASK = { 1, 2, 4 };

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int M = Integer.parseInt(in.readLine());
		int result = (24- M) + 24;
		System.out.println(result);
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    M = int(sys.stdin.readline())
    result = (24 - M) + 24
    print(result)

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `InputStreamReader` and `BufferedReader` classes are not needed in Python, as the `sys.stdin` object provides a similar functionality. The `StandardCharsets.UTF_8` constant is not needed in Python, as the `sys.stdin` object reads input as a string. The `parseInt` method is not needed in Python, as the `readline` method returns a string that can be converted to an integer using the `int` function. The `static` keyword is not needed in Python, as Python does not have a concept of static variables. The `main` method is not needed in Python, as the `if __name__ == "__main__":` block is used to run the code only when the file is executed as a script.</s>
