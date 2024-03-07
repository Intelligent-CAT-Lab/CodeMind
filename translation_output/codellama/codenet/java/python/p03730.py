<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < 5000; i++) {
			if (a * i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

for i in range(5000):
    if a * i % b == c:
        print("YES")
        break
else:
    print("NO")
```
Note: The `map` function is used to convert the input from strings to integers, and the `range` function is used to generate the numbers from 0 to 4999. The `for-else` loop is used to check if the condition is true for any of the numbers in the range, and if it is not, the `else` block is executed.</s>
