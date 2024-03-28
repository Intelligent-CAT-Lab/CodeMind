<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

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
This is the equivalent Python code for the given Java code. The `try` block is used to handle the `ValueError` exception that can occur when the input is not a valid integer. The `math.sqrt()` function is used to calculate the square root of the input, and the result is printed to the console.</s>
