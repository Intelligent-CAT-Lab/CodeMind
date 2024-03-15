```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            StringBuilder reversed = new StringBuilder(l);
            reversed.reverse();
            System.out.println(reversed.toString());
        }
    }
}
```
