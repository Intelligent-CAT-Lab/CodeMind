Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
-7

```
import java.util.Scanner;

public class p03556 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		int r = (int) Math.sqrt(scanner.nextInt());
		System.out.println(r * r);
	}
}

```

### Response:
```python
import math

def execute(scanner):
    r = int(math.sqrt(scanner.nextInt()))
    print(r * r)

if __name__ == '__main__':
    with open('input.txt', 'r') as f:
        scanner = Scanner(f)
        execute(scanner)
```

Note: The `with open('input.txt', 'r') as f:` line is used to read input from a file named `input.txt`. If you want to read input from the console, you can remove this line and use `Scanner(System.in)` instead.<|endoftext|>
