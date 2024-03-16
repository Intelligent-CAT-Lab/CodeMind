<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())

d = a // b
r = a % b
f = "{:.5f}".format(a / b)

print(d, r, f)
```
Note: The `map` function is used to convert the input strings to integers, and the `//` operator is used for integer division. The `format` function is used to format the result as a string with 5 decimal places.</s>
