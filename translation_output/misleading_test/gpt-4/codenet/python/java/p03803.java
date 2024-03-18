Here is the equivalent Java code for the provided Python program. Make sure to take inputs with a `Scanner` and print outputs with `System.out.println` in Java:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        Map<Integer, Integer> j = new HashMap<>();
        
        // Create a map to store the card values with their order
        for (int i = 2; i <= 13; i++) {
            j.put(i, i - 2);
        }
        // Add the Ace with the highest order
        j.put(1, 12);

        // Check who wins
        if (j.get(a) > j.get(b)) {
            System.out.println("Alice");
        } else if (j.get(a) < j.get(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

To run this program, make sure to input two integers on the same line, separated by a space, when prompted. The program will print out the winner according to the card game rules defined in the original Python code.
