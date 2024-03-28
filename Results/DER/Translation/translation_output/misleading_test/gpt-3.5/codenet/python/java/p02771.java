```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b != c) {
            System.out.println("Ye");
        } else if (b == c && a != b) {
            System.out.println("Ye");
        } else if (a == c && a != b) {
            System.out.println("Ye");
        } else {
            System.out.println("No");
        }
    }
}
```
