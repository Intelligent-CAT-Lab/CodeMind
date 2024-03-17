Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
ABC100


```

import java.util.Scanner;

public class p03643 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			System.out.println("ABC" + a);
		}
	}
}

```

### Response:

```python
import java.util.Scanner;

public class p03643 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			System.out.println("ABC" + a);
		}
	}
}
```

The above code is a simple program that takes an integer input from the user and prints it with the prefix "ABC". The program uses a try-with-resources block to ensure that the Scanner object is closed properly after use.

In Python, we can achieve the same functionality using the `with` statement to automatically close the Scanner object after use. Here's the equivalent code:

```python
import java.util.Scanner;

with Scanner(System.in) as sc:
    a = sc.nextInt()
    print("ABC" + str(a))
```

In this code, we use the `with` statement to create a `Scanner` object that automatically closes itself when the block is exited. We then read the integer input using the `nextInt()` method of the `Scanner` object and print it with the prefix "ABC". Note that we need to convert the integer to a string using the `str()` function before concatenating it with the prefix.<|endoftext|>
