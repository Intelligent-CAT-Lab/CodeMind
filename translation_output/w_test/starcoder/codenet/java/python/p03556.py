<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
9


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

python code:<fim_suffix><fim_middle>

```python
import math

def execute(scanner):
    r = int(math.sqrt(scanner.next()))
    print(r * r)

if __name__ == "__main__":
    import sys
    with open(sys.argv[1], 'r') as input_file:
        execute(input_file)
```

"""
<|endoftext|>
