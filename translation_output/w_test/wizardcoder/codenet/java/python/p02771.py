Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
Yes


```

import java.util.Scanner;

public class p02771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if((A == B && B == C)||(A!=B && A!=C && B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}

```

### Response:

```python
import java.util.Scanner;

public class p02771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if((A == B and B == C) or (A!=B and A!=C and B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
```

In Python, we use `and` instead of `&&` to combine conditions, and `or` instead of `||` to combine conditions. We also need to enclose the conditions in parentheses to ensure that they are evaluated in the correct order.<|endoftext|>
