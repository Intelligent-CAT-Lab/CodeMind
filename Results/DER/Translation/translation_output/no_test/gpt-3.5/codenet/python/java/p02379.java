```java
import java.util.Scanner;

public class DistanceCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x1 = Double.parseDouble(scanner.next());
        double y1 = Double.parseDouble(scanner.next());
        double x2 = Double.parseDouble(scanner.next());
        double y2 = Double.parseDouble(scanner.next());

        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.printf("%.6f\n", distance);
    }
}
```
