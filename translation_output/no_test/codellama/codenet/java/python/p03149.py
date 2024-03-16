<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[] = new int[4];
		for (int i = 0; i < 4; i++) {
			N[i] = sc.nextInt();
		}
		boolean ans  = false;
		Arrays.sort(N);
		if (N[0] == 1 && N[1] ==4 && N[2]==7 && N[3]==9) {
			ans = true;
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

N = list(map(int, sys.stdin.readline().split()))
N.sort()

if N == [1, 4, 7, 9]:
    print("YES")
else:
    print("NO")
```
This code first reads a line of input from the user, splits it into a list of integers using the `split()` method, and then sorts the list using the `sort()` method.

Next, it checks if the list is equal to the list `[1, 4, 7, 9]`, and if it is, it prints "YES" to the console. If the list is not equal to `[1, 4, 7, 9]`, it prints "NO" to the console.

Note that the `map()` function is used to convert the input string into a list of integers. The `sys.stdin.readline()` method is used to read a line of input from the user, and the `split()` method is used to split the input string into a list of integers.</s>
