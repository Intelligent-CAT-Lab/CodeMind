Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '?') {
                array[i] = 'D';
            }
        }

        String output = new String(array);
        System.out.println(output);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, converts it to a character array, replaces all '?' characters with 'D', and then prints out the resulting string.
