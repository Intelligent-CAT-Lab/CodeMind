```java
import java.util.Scanner;

public class FoodSafety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (b <= a) {
            System.out.println("delicious");
        } else if (b - a <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
        
        scanner.close();
    }
}
```
