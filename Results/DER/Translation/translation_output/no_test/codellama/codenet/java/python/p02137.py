<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02137 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(p / 500 * 500);
	}
}



Translate the above java code to python.

python code:

[/INST]
```
import math

p = int(input("Enter a number: "))
print(math.floor(p / 500) * 500)
```
Explanation:

* `math.floor()` is used to round down a number to the nearest integer.
* `input()` is used to get input from the user.
* `print()` is used to print the result.

Note: The `math.floor()` function is used instead of the `//` operator to ensure that the result is always an integer.</s>
