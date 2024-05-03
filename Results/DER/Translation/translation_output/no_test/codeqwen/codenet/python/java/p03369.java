Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(700 + 100 * count);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the number of 'o' characters in the string, and then prints the sum of 700 and 100 times the count.
