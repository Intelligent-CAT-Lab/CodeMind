Here is the translated Java code for the given Python script:

```java
import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        if (S.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (S.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }

        scanner.close();
    }
}
```

Please take note that in Java, string comparison is done using the `.equals()` method, not `==` as in Python. Additionally, the `Scanner` class is used for reading input from the user, and it must be closed after usage to free resources.
