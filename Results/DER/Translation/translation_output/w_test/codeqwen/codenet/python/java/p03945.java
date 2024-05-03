Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W') {
                count++;
            } else if (input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

This Java program reads a string from the user, then iterates through the string checking for occurrences of "BW" or "WB". If it finds one, it increments a counter. After checking all pairs of adjacent characters, it prints the counter.
