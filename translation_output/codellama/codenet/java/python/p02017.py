<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}



Translate the above java code to python.

python code:

[/INST]
```
import sys

h, w, x, y = map(int, sys.stdin.readline().split())

if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")
```
Note: The `map` function is used to convert the input from a string to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` function is used to split the input into a list of strings, which are then converted to integers using the `map` function.</s>
