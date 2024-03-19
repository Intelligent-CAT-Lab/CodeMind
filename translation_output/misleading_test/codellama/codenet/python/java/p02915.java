<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
-92

```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			System.out.println(n * n * n);
		}
	}
}
```
This code uses the `Scanner` class to read input from the standard input stream, and the `hasNextInt()` method to check if there is another integer to read. If there is, it uses the `nextInt()` method to read the integer and the `println()` method to print the result of the calculation. The `println()` method is used instead of `print()` because it adds a newline character at the end of the output.</s>
