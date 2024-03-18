```java
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (S.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Weather.main(args);
    }
}
```
```java
// Test Input: Sunny
// Expected Output: Cloudy
// Actual Output will depend on user input when running the program
```
