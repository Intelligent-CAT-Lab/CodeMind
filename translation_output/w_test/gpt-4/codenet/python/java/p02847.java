To translate your Python code into Java, I'll provide Java code that reads a line from the standard input (typically the console), looks up the day of the week in a map, and then prints out the calculated value. Java code is typically more verbose than Python, so the equivalent code is a little longer. Here it is:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayOfWeek {
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

To run this code, you would save it to a file (e.g., `DayOfWeek.java`), compile it with `javac DayOfWeek.java`, and then run it with `java DayOfWeek`. When it is waiting for input, you would enter "SAT" (or some other day of the week) and then press Enter. It should then output the expected result, which for "SAT" would be 1.
