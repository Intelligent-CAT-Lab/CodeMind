<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a + b + c >= 22:
    print("bust")
else:
    print("win")
```
In this code, we use the `map` function to convert the input from the user into integers. We then use the `if` statement to check if the sum of `a`, `b`, and `c` is greater than or equal to 22. If it is, we print "bust", otherwise we print "win".</s>
