```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String aString = parts[0];
        String bString = parts[1].charAt(0) + parts[1].substring(2);
        
        long a = Long.parseLong(aString);
        long b = Long.parseLong(bString);
        
        long result = (a * b) / 100;
        System.out.println(result);
    }
}
```
