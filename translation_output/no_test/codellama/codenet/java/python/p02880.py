<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f ? "Yes" : "No";
		System.out.println(ret);
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

N = int(sys.stdin.readline().strip())
f = False
for A in range(1, 10):
    if N % A == 0 and N // A < 10:
        f = True
        break

print("Yes" if f else "No")
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream. The `strip()` method is used to remove any leading or trailing whitespace from the input. The `int()` function is used to convert the input to an integer. The `range()` function is used to generate a sequence of numbers from 1 to 9. The `break` statement is used to exit the loop once a valid solution is found.</s>
