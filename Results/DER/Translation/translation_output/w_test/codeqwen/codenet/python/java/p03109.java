Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split("/");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        if (year <= 2018) {
            System.out.println("Heisei");
        } else if (year == 2019 && month <= 4 && day <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a date from the user, splits it into year, month, and day, and then checks if the date is before or after 2018. If it is before or equal to 2018, it prints "Heisei". If it is after 2018, it checks if the year is 2019, the month is before or equal to 4, and the day is before or equal to 30. If all of these conditions are met, it prints "Heisei". Otherwise, it prints "TBD".
