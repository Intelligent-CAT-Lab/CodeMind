Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

public class p02467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		System.out.print(n + ":");
		for (int i = 2; n >= i * i; i++) {
			if (n % i == 0) {
				n /= i;
				System.out.print(" " + i);
			}
		}
		System.out.println(" " + n);
	}

}
```

Explanation:

- We import the `java.util.Scanner` class to read input from the user.
- We declare a `Scanner` object `sc` to read input from the user.
- We declare a `long` variable `n` to store the input number.
- We read the input number from the user using `sc.nextLine()` and store it in `n`.
- We print the input number followed by a colon.
- We use a `for` loop to iterate over all the numbers from 2 to the square root of `n`.
- Inside the loop, we check if `n` is divisible by `i`. If it is, we divide `n` by `i` and print `i`.
- If `n` is not divisible by `i`, we increment `i` and continue the loop.
- After the loop, we print the remaining value of `n`.<|endoftext|>
