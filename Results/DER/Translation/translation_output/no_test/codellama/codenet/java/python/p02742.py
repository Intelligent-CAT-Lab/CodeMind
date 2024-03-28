<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0 ? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}

Translate the above java code to python.

python code:

[/INST]
```
import sys

w, h = map(int, sys.stdin.readline().split())

if w == 1 or h == 1:
    print(1)
    sys.exit()

c = (w * h) // 2 if (w * h) % 2 == 0 else (w * h) // 2 + 1

print(c)
```
Note: The `map` function is used to convert the input strings to integers, and the `sys.exit()` function is used to exit the program after printing the result.</s>
