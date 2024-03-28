```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r1, r2;
        Scanner scanner = new Scanner(System.in);

        try {
            String[] input = scanner.nextLine().split(" ");
            r1 = Double.parseDouble(input[0]);
            r2 = Double.parseDouble(input[1]);
        } catch (Exception e) {
            System.out.println("Error reading input data");
            return;
        }

        double result = 1 / ((r2 + r1) / (r1 * r2));
        System.out.println(result);
    }
}
```
