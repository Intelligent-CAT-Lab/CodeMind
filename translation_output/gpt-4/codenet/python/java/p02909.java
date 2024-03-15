Here's the equivalent Java code for the given Python script:

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

This Java program does the same thing as the Python script. It reads a string from the user, checks the value, and prints out the next weather state accordingly. Note that the `equals()` method is used to compare strings for equality in Java, instead of the `==` operator which is used in Python.
