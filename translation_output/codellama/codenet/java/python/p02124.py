<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

ans = "ai1333"
x = int(sys.stdin.readline())
for i in range(x // 100):
    ans += "3"
print(ans)
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java.</s>
