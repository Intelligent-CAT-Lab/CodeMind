<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03323 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 8 and b <= 8:
    print("Yay!")
else:
    print(":(")
```
Explanation:

* `import sys` imports the `sys` module, which provides access to the standard input and output streams.
* `a, b = map(int, sys.stdin.readline().split())` reads a line from the standard input and splits it into two integers using the `split()` method. The `map()` function is used to convert the strings to integers.
* `if a <= 8 and b <= 8:` checks if both `a` and `b` are less than or equal to 8.
* `print("Yay!")` prints "Yay!" if both conditions are true.
* `else:` is the else clause of the if statement.
* `print(":(")` prints ":(", which is the opposite of "Yay!".

Note: The `sys` module is not necessary in this case, as the input can be read directly from the command line using `input()` function. However, the `sys` module is useful when reading input from a file or a pipe.</s>
