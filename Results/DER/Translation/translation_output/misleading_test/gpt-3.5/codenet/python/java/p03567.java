```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        if(S.contains("AC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
