```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        
        double result = Math.ceil((double) h / a);
        System.out.println((int) result);
    }
}
```
