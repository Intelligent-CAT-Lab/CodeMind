Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");

        ArrayList<String> list = new ArrayList<>();

        for (String var : words) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for (String var : list) {
            System.out.print(var + " ");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, removes commas and periods, splits the string into words, and then checks each word's length. If the word's length is between 3 and 6 (inclusive), it is added to an ArrayList. Finally, it prints out each word in the ArrayList, separated by spaces.
