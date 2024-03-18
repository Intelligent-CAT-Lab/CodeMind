```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        String b = numbers[1].charAt(0) + numbers[1].substring(2);
        long a = Long.parseLong(numbers[0]);
        long valueB = Long.parseLong(b);
        
        long result = a * valueB / 100;
        System.out.println(result);
    }
}
```
