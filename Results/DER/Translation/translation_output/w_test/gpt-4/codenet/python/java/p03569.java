Below is the Python code translated into Java. In Java, to read input from the user, we can use the `Scanner` class from the `java.util` package. Also, Java does not have a built-in `exit` function like Python, but we can achieve the same effect by returning from the `main` method or by calling `System.exit(0)`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        int i = 0;
        int j = S.length() - 1;
        int c = 0;

        while (true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                if (S.charAt(i) == 'x') {
                    i += 1;
                    c += 1;
                } else if (S.charAt(j) == 'x') {
                    j -= 1;
                    c += 1;
                } else {
                    System.out.println("-1");
                    return; // Exit the program since we are in the main method
                }
            }
        }
        System.out.println(c);
    }
}
```

This Java program reads a string from the console, performs the same operations as the Python code, and prints the result or `-1` when an invalid condition is encountered.
