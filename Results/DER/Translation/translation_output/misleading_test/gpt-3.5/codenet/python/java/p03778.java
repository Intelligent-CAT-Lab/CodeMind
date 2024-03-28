```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (Math.abs(a-b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a-b) - w);
        }
    }
}
```
