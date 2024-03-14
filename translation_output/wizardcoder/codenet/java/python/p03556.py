Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.Scanner

def execute(scanner):
    r = int(java.lang.Math.sqrt(scanner.nextInt()))
    print(r * r)

if __name__ == '__main__':
    with Scanner(System.in) as scanner:
        execute(scanner)
```

Note: The `java` package is not available in Python, so we need to use the `java.lang.Math` class instead of `java.util.Math`. Also, we need to use `Scanner` from the `java.util` package instead of the `Scanner` class from the `java.util.Scanner` module.<|endoftext|>
