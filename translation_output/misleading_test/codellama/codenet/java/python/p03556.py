<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import math

def main():
    try:
        r = int(math.sqrt(input()))
        print(r * r)
    except ValueError:
        print("Invalid input")

if __name__ == "__main__":
    main()
```
This code uses the `math.sqrt()` function to calculate the square root of the input, and then prints the result. It also uses the `input()` function to read the input from the user.

The `try` block is used to handle the case where the input is not a valid integer. In this case, the `ValueError` exception is raised, and the code inside the `except` block is executed. In this case, the code prints an error message to the user.

The `if __name__ == "__main__":` block is used to indicate that the code should only be executed if it is run as a script, rather than being imported as a module. This is a common convention in Python.</s>
