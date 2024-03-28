<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
 
class p02811 {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

K, X = map(int, sys.stdin.readline().split())

if X <= 500 * K:
    print("Yes")
else:
    print("No")
```
Note: The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into two integers.</s>
