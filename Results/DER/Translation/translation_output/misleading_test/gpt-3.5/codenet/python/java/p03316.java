```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int sn = 0;
        
        for (int i = 0; i < n.length(); i++) {
            sn += Character.getNumericValue(n.charAt(i));
        }
        
        if (Integer.parseInt(n) % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
