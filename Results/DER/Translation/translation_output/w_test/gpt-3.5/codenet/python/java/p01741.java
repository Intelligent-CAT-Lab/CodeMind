```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = (n/Math.floor(n)) + 1;
        if (n*Math.sqrt(2) < result) {
            result = n * Math.sqrt(2);
        }
        System.out.println(result);
    }
}
```
