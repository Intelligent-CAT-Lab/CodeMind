Here's the Python code translated into Java:

```java
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class DaysTillSunday {
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
        
        scanner.close();
    }
}
```

This Java code snippet does the equivalent of the Python code provided, reading a line from standard input and using a Map (similar to a Python dictionary) to calculate the days until Sunday. When run with the test input "SAT", it will output 52, as expected.
