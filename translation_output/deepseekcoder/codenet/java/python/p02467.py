<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
# Python program to solve the problem

# Get input from user
n = int(input())
print(str(n) + ":", end="")

# Start from 2 and go up to sqrt(n)
i = 2
while n >= i * i:
    if n % i:
        i += 1
    else:
        n = n // i
        print(" " + str(i), end="")

print(" " + str(n))
```

This Python program does the same thing as the Java program. It reads a number from the user, prints the number and its factors. It uses a while loop to find the factors. If the number is divisible by the current factor, it divides the number by the factor and prints the factor. If the number is not divisible by the current factor, it increments the factor. The loop continues until the factor is greater than the square root of the number. The last factor is always the remaining number, which is also a factor of the original number.
<|EOT|>
