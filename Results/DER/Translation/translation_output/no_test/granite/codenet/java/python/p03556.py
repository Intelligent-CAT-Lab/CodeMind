System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import math

def execute(scanner):
    r = int(math.sqrt(scanner.nextInt()))
    print(r * r)

with Scanner(System.in) as scanner:
    execute(scanner)
```<|endoftext|>
