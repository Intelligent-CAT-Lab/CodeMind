```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        String replacedString = s.replace(",", " ");
        
        System.out.println(replacedString);
    }
}
```
