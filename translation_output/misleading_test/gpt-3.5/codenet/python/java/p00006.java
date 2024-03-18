```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        StringBuilder reversed = new StringBuilder(input);
        System.out.println(reversed.reverse().toString());
    }
}
```
