Here's the translated code from Python to Java:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DirectionsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        Set<Character> uniqueDirections = new HashSet<>();
        for (char ch : input.toCharArray()) {
            uniqueDirections.add(ch);
        }

        if (uniqueDirections.size() == 4) {
            System.out.println("Yes");
        } else if (uniqueDirections.size() == 3) {
            System.out.println("No");
        } else if (uniqueDirections.size() == 2) {
            if (uniqueDirections.contains('N') && uniqueDirections.contains('S')) {
                System.out.println("Yes");
            } else if (uniqueDirections.contains('E') && uniqueDirections.contains('W')) {
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

To run a test case with your sample input "SENW", you would simply run the `DirectionsCheck` class and enter "SENW" when prompted for input.

Here's how you can compile and then run the code using command-line interface assuming you have the JDK installed:

```
javac DirectionsCheck.java
java DirectionsCheck
```

Then, input "SENW" when prompted, and you should expect to see the output:

```
Yes
```

This code defines a `DirectionsCheck` class with a `main` method. The `main` method reads input from the user, generates a `Set` of unique characters, and determines if the conditions for "Yes" or "No" are met based on the combinations of "N", "S", "E", and "W".
