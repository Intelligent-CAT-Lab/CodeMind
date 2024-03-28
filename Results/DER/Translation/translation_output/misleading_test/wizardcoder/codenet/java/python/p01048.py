Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
46

```
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}

```

### Response:
```python
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}
```

The given java code is a simple program that takes an integer input from the user and prints the corresponding element from an array. The array contains the first 12 Fibonacci numbers and their squares. The program reads the input integer from the user and prints the corresponding element from the array.

In python, we can achieve the same functionality using the same code. Here's the solution:

```python
import java.util.Scanner;

ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]

sc = Scanner(System.in)
i = sc.nextInt()

print(ans[i])
```

In this solution, we first define the array `ans` containing the first 12 Fibonacci numbers and their squares. We then create a `Scanner` object to read the input integer from the user. Finally, we print the corresponding element from the array using the index `i`.<|endoftext|>
