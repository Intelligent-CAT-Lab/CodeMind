Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
12: -44 -21 18

```
import java.util.Scanner;

//?Â´??????Â°????Â§Â£?????????????????Â°??????
public class p02467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		System.out.print(n + ":");
		for (int i = 2; n >= i * i;) {
			if (n % i == 0) {
				n = n / i;
				System.out.print(" " + i);
			} else {
				i++;
			}
		}
		System.out.println(" " + n);
	}

}
```

### Response:
```python
import math

#?Â´??????Â°????Â§Â£?????????????????Â°??????
n = int(input())
print(n, end=':')
for i in range(2, int(math.sqrt(n))+1):
    while n % i == 0:
        print(''+ str(i), end='')
        n = n // i
if n > 1:
    print(''+ str(n))
else:
    print()
```

Explanation:

- We first import the math module to use the square root function.
- We take the input as an integer and store it in the variable n.
- We print the value of n followed by a colon.
- We use a for loop to iterate from 2 to the square root of n.
- Inside the loop, we use a while loop to check if n is divisible by i.
- If it is, we print the value of i and divide n by i using integer division (//).
- If n is not divisible by i, we increment i by 1 and continue the loop.
- After the loop, we check if n is greater than 1. If it is, we print the value of n.
- If n is 1, we don't print anything.<|endoftext|>
