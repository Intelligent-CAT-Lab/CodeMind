Certainly! Below is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        String w = scanner.nextLine();
        boolean isEven = true;

        for (int i = 0; i < alfa.length(); i++) {
            char c = alfa.charAt(i);
            long count = w.chars().filter(ch -> ch == c).count();
            if (count % 2 == 1) {
                System.out.println("No");
                isEven = false;
                break;
            }
        }

        if (isEven) {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
```

A few points to note about the differences between Java and Python:
- In Java, we must import the `Scanner` class to read input from the user.
- Java is statically typed, so we declare variables with their type.
- Instead of using `input()` like in Python, we use `scanner.nextLine()` to read a whole line.
- The `for` loop iterates using an integer index to access characters in the string, rather than iterating directly over the string as in Python.
- We need to explicitly convert the `String` to a stream of characters and count occurrences of each character to replicate the `count()` method in Python.
- In Java, we use `System.out.println` to print to the console.
- Java does not have an `exit()` function like Python; we manage control flow using `break` and a flag variable (`isEven` in this case) to determine if we should print "Yes" at the end.
- Everything is enclosed in a class and a `main` method, which is the entry point of the Java application.
- Unlike Python, where indentation denotes block structure, Java uses braces `{}`.
- Remember to close the `Scanner` object at the end to avoid resource leaks.
