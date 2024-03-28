<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1118

Expected output:
e+X

```
import java.util.Scanner;

public class p03543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int n1 = n % 10;
		int n10 = (n - n1) % 100/10;
		int n100 = (n - n1 - n10 * 10) % 1000/100;
		int n1000 = n / 1000;

		if ((n1 == n10 && n1 == n100)
				|| (n10 == n100 && n10 == n1000)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

```
[/INST]
```python
import math

def is_palindrome(n):
    n1 = n % 10
    n10 = (n - n1) // 10 % 10
    n100 = (n - n1 - n10 * 10) // 100 % 10
    n1000 = n // 1000

    if (n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000):
        return "Yes"
    else:
        return "No"

n = int(input())
print(is_palindrome(n))
```

Explanation:

The `is_palindrome` function takes an integer `n` as input and returns a string `"Yes"` if `n` is a palindrome, and `"No"` otherwise.

The function first extracts the last digit of `n` using the modulo operator `%`, and then extracts the second-to-last digit using the modulo operator `%` and the integer division operator `//`. The third-to-last digit is extracted using the modulo operator `%` and the integer division operator `//`, and the fourth-to-last digit is extracted using the integer division operator `//`.

The function then checks if the first digit is equal to the second digit, and if the second digit is equal to the third digit. If both conditions are true, the function returns `"Yes"`, otherwise it returns `"No"`.

The `main` function takes an integer `n` as input using the `input` function, and then calls the `is_palindrome` function with `n` as an argument. The result of the `is_palindrome` function is then printed to the console.

Test case:

Input:
1118

Output:
Yes</s>
