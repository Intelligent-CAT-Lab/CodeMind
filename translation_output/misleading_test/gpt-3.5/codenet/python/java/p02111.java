```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        
        int result1 = (input * 2) / 60;
        int result2 = (input * 2) % 60;
        
        System.out.println(result1 + " " + result2 + " " + 58);
    }
}
```
