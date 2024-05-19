System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 0

Expected output:
127

```

import java.io.IOException;
import java.util.Scanner;

public class p00509 {

	public static void main(String[] args) throws IOException {

		new p00509().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int[] num = new int[n];
		if (c < 0) {
			if (n == 1)
				System.out.println(11);
			else {
				for (int i = 0; i < n * 2; i++)
					System.out.print(9);
				System.out.println();
			}
		} else {
			int a = 1;
			for (int i = 0; i < n; i++)
				a *= 10;
			int b = a / 10;
			a--;
			for (int i = a; i >= b; i--) {
				if (check(i, c))
					return;

			}
		}
	}

	private boolean check(int i, int c) {
		StringBuilder builder = new StringBuilder(String.valueOf(i));
		StringBuilder builder2 = new StringBuilder(String.valueOf(i)).reverse();
		builder.append(c).append(builder2);
		if (prime(Integer.valueOf(builder.toString()))) {
			System.out.println(builder);
			return true;
		} else
			return false;

	}

	private boolean prime(int b) {
		for (int i = 2; i * i <= b; i++)
			if (b % i == 0)
				return false;
		return true;
	}
}
```


Answer:
```python
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def generate_palindrome(n, c):
    num = 10**n - 1
    while num >= 10**(n-1):
        if is_prime(num * 100 + c * 10 + num // 10):
            return num * 100 + c * 10 + num // 10
        num -= 1

def main():
    n, c = map(int, input().split())
    result = generate_palindrome(n, c)
    if result is None:
        print(11)
    else:
        print(result)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ((1, 0), 127),
    ((2, 0), 101),
    ((3, 0), 103),
    ((4, 0), 101),
    ((1, 1), None),
    ((2, 1), None),
    ((3, 1), None),
    ((4, 1), None),
]
for test_input, expected_output in test_cases:
    assert generate_palindrome(*test_input) == expected_output
```<|endoftext|>
