System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import math

def execute(scanner):
    r = int(math.sqrt(scanner.nextInt()))
    print(r * r)

if __name__ == "__main__":
    with open("input.txt", "r") as scanner:
        execute(scanner)
```

Test input:
```
10
```

Expected output:
```
-7
```<|endoftext|>
