Below is the Python code translated into Java:

```java
import java.util.Scanner;

public class DateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] dateParts = input.split("/");

        int A = Integer.parseInt(dateParts[0]);
        int B = Integer.parseInt(dateParts[1]);
        int C = Integer.parseInt(dateParts[2]);

        if (A <= 2018) {
            System.out.println("Heisei");
        } else if (A == 2019 && B <= 4 && C <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
        
        scanner.close();
    }
}
```

This Java code replicates the functionality of the Python code provided, taking a date input in the format "YYYY/MM/DD", splitting the input into components, and determining whether the date falls within the Heisei era or if the date is "TBD" (to be determined).
