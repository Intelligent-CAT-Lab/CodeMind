```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double r = scanner.nextDouble();
        
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        
        System.out.printf("%.5f %.5f", s, l);
        
        scanner.close();
    }
}
```
