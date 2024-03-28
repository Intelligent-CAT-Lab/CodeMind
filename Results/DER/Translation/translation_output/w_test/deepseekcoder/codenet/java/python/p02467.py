<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
12: 2 2 3


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
def prime_factors(n):
    i = 2
    factors = []
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors

n = int(input())
print(f"{n}: {' '.join(map(str, prime_factors(n)))}")
```

This Python code does the same thing as the Java code. It reads an integer from the input, calculates its prime factors, and prints them out. The prime factors are calculated by dividing the number by each integer starting from 2, and if the division results in a remainder, the integer is incremented. If the division results in an exact division, the integer is added to the list of factors and the number is updated. The process continues until the square of the integer is greater than the number. If the remaining number is greater than 1, it is added to the list of factors. The factors are then printed out in the format requested by the problem statement.
<|EOT|>
