Here is the Java equivalent of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();

        Map<String, Integer> week = new HashMap<>();
        week.put("SUN", 0);
        week.put("MON", 1);
        week.put("TUE", 2);
        week.put("WED", 3);
        week.put("THU", 4);
        week.put("FRI", 5);
        week.put("SAT", 6);

        System.out.println(7 - week.get(a));
    }
}
```

This Java code does the same thing as your Python code. It reads a line from the standard input, trims it to remove any leading or trailing whitespace, and then uses a HashMap to look up the day of the week in the week HashMap. The result is then printed to the standard output.
