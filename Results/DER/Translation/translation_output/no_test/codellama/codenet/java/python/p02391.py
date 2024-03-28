<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02391 {

	public static void main(String[] args) {
		
		String CMD = null ;
		BufferedReader BR = null;
		BR = new BufferedReader(new InputStreamReader(System.in));
		try {CMD = BR.readLine();
		} 
		catch (IOException e) {e.printStackTrace();
		}
		String[] str = CMD.split(" "); 
		
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		
		if(x==y){
			System.out.println("a == b");
		}if(x<y){
			System.out.println("a < b");
		}if(x>y){
			System.out.println("a > b");
		}

	}

}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

cmd = sys.stdin.readline()
str = cmd.split(" ")

x = int(str[0])
y = int(str[1])

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
elif x > y:
    print("a > b")
```
Note: The `sys` module is used to read input from the standard input stream, and the `readline()` method is used to read a single line of input. The `split()` method is used to split the input string into a list of strings, and the `int()` function is used to convert the strings to integers. The `if` statement is used to compare the values of `x` and `y`, and the `print()` function is used to print the appropriate message.</s>
