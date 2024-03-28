<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int list[] = new int[S + 1];
		long ans = 0;
		for (int i = 1; i < S + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
			} else {
				ans = ans + i;
			}
		}
		System.out.println(ans);
	}
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

S = int(input())
list = [0] * (S + 1)
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        continue
    ans += i
print(ans)
```
Note: The `continue` statement is used to skip the current iteration of the loop and move on to the next one. In this case, it is used to skip the current iteration if the number is divisible by 3 or 5.</s>
