Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class CheckXInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		int a = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == 'x') {
				a += 1;
			}
		}
		System.out.println(a <= 7 ? "YES" : "NO");
		scanner.close();
	}
}
```

Several points to note in the conversion process:

1. Java uses the `Scanner` class to get the user input, while Python uses the `input()` function.
2. In Java, you use the `charAt()` method to access characters in a string by their index.
3. Java strings are indexed starting from 0, just like Python.
4. The ternary operator `? :` in Java is used in place of the Python list-based output you provided.
5. Structured in a class with a `main` method to make it runnable as a standalone Java application.
