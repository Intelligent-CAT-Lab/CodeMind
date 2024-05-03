Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            if (!isInArray(odd, s.charAt(i) + "")) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!isInArray(even, s.charAt(j) + "")) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static boolean isInArray(String[] array, String value) {
        for (String item : array) {
            if (item.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks every second character (starting from index 0) to see if it's in the "odd" array. If it's not, it prints "No" and exits the program. If it is, it moves on to the next character. It does the same thing for every second character starting from index 1. If all characters are in the correct arrays, it prints "Yes".
