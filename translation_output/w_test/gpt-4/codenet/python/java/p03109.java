Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class EraCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("/");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (year < 2019 || (year == 2019 && month == 4 && day <= 30)) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```

Make sure to run this Java program with the test input as specified. The program will read a line from the standard input and process it accordingly, then it will output "Heisei" for the input "2019/04/30".
