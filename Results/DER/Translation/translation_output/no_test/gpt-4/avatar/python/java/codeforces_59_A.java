Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        StringBuilder out = new StringBuilder(" ");
        int cap = 0;
        int small = 0;

        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }

        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                out.append(Character.toLowerCase(t));
            }
        } else {
            for (char t : txt.toCharArray()) {
                out.append(Character.toUpperCase(t));
            }
        }

        System.out.println(out.toString());
        scanner.close();
    }
}
```

This Java code takes a string input from the user, counts the number of uppercase and lowercase characters, and then converts the string to all uppercase or all lowercase depending on which count is higher. It then prints the result. Make sure to run this Java program in a class named `Main` or rename the class appropriately based on your development environment.
