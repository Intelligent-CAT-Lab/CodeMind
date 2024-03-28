Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String A = "CODEFESTIVAL2016";
        int cnt = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != S.charAt(i)) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        
        scanner.close();
    }
}
```

This Java code does the following:

1. It imports the `Scanner` class for taking input from the user.
2. It defines a `Main` class and its `main` method which is the entry point of the Java program.
3. Inside the `main` method, it creates a `Scanner` object to read the input `S` from the user.
4. It defines the string `A` and initializes the counter `cnt` to 0.
5. It loops through the characters of string `A`, comparing each character to the corresponding character in `S` and increments the counter `cnt` if they are different.
6. It prints the value of `cnt` which represents the number of different characters.
7. Finally, it closes the `Scanner` object to prevent resource leaks.

Remember that the exact behavior of the program might differ slightly in case of differences in handling user input between Python and Java. In Java, the `Scanner` class uses whitespace as the default delimiter between tokens (including the newline character), so you must ensure that your input doesn't contain unexpected whitespace.
