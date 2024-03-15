<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import math

def main():
    try:
        scanner = input()
        execute(scanner)
    except:
        pass

def execute(scanner):
    r = int(math.sqrt(scanner))
    print(r * r)

main()
```</s>
