Here's the Python code translated into Java:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        String A = parts[0];
        String x = parts[1];
        String C = parts[2];
        
        System.out.println("A" + x.charAt(0) + "C");
    }
}
```
