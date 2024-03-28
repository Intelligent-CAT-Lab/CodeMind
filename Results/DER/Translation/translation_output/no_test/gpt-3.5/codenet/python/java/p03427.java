```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        
        int total = 0;
        for (int i = 0; i < n.length(); i++) {
            total += Character.getNumericValue(n.charAt(i));
        }
        
        int result = Math.max(Character.getNumericValue(n.charAt(0)) - 1 + 9 * (n.length() - 1), total);
        System.out.println(result);
    }
}
```
