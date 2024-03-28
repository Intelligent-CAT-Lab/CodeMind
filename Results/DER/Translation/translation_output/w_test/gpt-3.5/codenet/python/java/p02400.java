```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double r = Double.parseDouble(scanner.nextLine());
        
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        
        System.out.printf("%.6f %.6f%n", s, l);
    }
}
```
