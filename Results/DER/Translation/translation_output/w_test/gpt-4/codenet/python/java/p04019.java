Here is the Java equivalent of the provided Python code enclosed within `java` tags.

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DirectionCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        if (uniqueChars.size() == 4) {
            System.out.println("Yes");
        } else if (uniqueChars.size() == 3) {
            System.out.println("No");
        } else if (uniqueChars.size() == 2) {
            if (uniqueChars.contains('N') && uniqueChars.contains('S')) {
                System.out.println("Yes");
            } else if (uniqueChars.contains('E') && uniqueChars.contains('W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```

To run this Java code, you'll typically compile it first using `javac DirectionCheck.java` and then run it with `java DirectionCheck`. When the program is running, input the test case string like "SENW", and it should return the expected output "Yes".
