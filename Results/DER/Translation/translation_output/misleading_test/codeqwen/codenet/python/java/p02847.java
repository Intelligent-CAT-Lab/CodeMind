Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();

        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 0; i < week.length; i++) {
            if (week[i].equals(a)) {
                System.out.println(7 - i);
                break;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line from the standard input, trims any leading or trailing whitespace, and then checks if the line matches any of the strings in the `week` array. If it finds a match, it prints the difference between 7 and the index of the matching string in the `week` array.
