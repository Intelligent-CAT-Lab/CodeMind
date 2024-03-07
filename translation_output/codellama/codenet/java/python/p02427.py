<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < Math.pow(2, n); i++) {
			int temp = i;
			System.out.print(i + ":");
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) System.out.print(" " + j);
				temp /= 2;
			}
			System.out.println();
		}
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import math

n = int(input("Enter a number: "))

for i in range(math.pow(2, n)):
    temp = i
    print(i, end=":")
    for j in range(n):
        if temp % 2 == 1:
            print(" " + str(j), end="")
        temp //= 2
    print()
```
This code uses the `math.pow(2, n)` function to calculate the number of iterations in the loop, and the `range(n)` function to create a range of numbers from 0 to `n-1`. The `temp` variable is used to keep track of the current number, and the `j` variable is used to keep track of the current iteration. The `if` statement checks if the current number is odd, and if it is, it prints the current iteration number. The `end=""` parameter is used to prevent the newline character from being printed after each iteration.</s>
