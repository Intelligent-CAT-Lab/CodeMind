<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03469 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

		  Scanner sc = new Scanner(System.in);
		  
		  String S = sc.nextLine();
		  char c [] = S.toCharArray();
		  
		  System.out.print(2018);
		 for(int i = 4; i <c.length;i++) {
			 System.out.print(c[i]);
		 }
		 

	}

}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

S = sys.stdin.readline()
c = list(S)

print(2018)
for i in range(4, len(c)):
    print(c[i], end="")
```
Note: The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `list()` function is used to convert the string `S` into a list of characters. The `range()` function is used to iterate over the characters in the list, starting from the 4th character. The `end=""` parameter is used to specify that the output should be printed on the same line, without a newline character.</s>
