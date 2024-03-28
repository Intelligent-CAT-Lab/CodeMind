<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03609 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),t=scan.nextInt();
		if(x>t) {
			System.out.println(x-t);
		}
		else if(x<=t) {
			System.out.println("0");
		}

	}

}

Translate the above java code to python.

python code:

[/INST]
```
import sys

x, t = map(int, input().split())

if x > t:
    print(x - t)
elif x <= t:
    print(0)
```
Note: The `map` function is used to convert the input from a string to an integer. The `input` function is used to get the input from the user. The `split` method is used to split the input into two parts, which are then converted to integers using the `map` function.</s>
