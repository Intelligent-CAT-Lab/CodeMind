```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println("0".repeat(a) + "1".repeat(w - a));
            } else {
                System.out.println("1".repeat(a) + "0".repeat(w - a));
            }
        }
    }
}
```
