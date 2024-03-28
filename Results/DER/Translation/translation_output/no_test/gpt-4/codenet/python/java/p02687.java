```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        
        if ("ARC".equals(string)) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
        
        scanner.close();
    }
}
```
