```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int result = countConsecutivePairs(input);
        System.out.println(result);
    }
    
    public static int countConsecutivePairs(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') ||
                    (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W')) {
                count++;
            }
        }
        return count;
    }
}
```
