<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p00252 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		if(a[0] == 1 && a[1] == 1) {
			System.out.println("Open");
		}
		else if(a[2] == 1) {
			System.out.println("Open");
		}
		else {
			System.out.println("Close");
		}
		
	}

}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

a = [int(x) for x in sys.stdin.readline().split()]

if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream, and the `split()` method is used to split the line into a list of strings. The `int()` function is used to convert the strings to integers.</s>
