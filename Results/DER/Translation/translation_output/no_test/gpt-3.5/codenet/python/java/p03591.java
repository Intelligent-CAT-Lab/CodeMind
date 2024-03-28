```java
import java.util.Scanner;

public class YakDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String S = scanner.nextLine();
        
        if (S.length() >= 4 && S.substring(0, 4).equals("YAKI")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```
