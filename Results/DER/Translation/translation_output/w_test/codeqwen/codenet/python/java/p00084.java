Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                System.out.print(word + " ");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, removes commas and periods, splits the string into words, and then prints out the words that have a length between 3 and 6 characters.
