<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03345 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = a-b;
		if(Math.abs(ans)>Math.pow(10, 18)) {
			System.out.println("Unfair");
			return;
		}
		if(k%2 == 0) {
			System.out.println(ans);
		}
		else {
			System.out.println(ans*-1);
		}
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import math

a = int(input())
b = int(input())
c = int(input())
k = int(input())

ans = a - b

if abs(ans) > 10**18:
    print("Unfair")
    return

if k % 2 == 0:
    print(ans)
else:
    print(ans * -1)
```
Note: The `math.pow(10, 18)` function in Java is equivalent to the `10**18` in Python.</s>
