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
            if (!isInArray(odd, s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!isInArray(even, s.charAt(j))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static boolean isInArray(String[] array, char value) {
        for (String item : array) {
            if (item.charAt(0) == value) {
                return true;
            }
        }
        return false;
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks every other character in the string (starting with the first character) to see if it is in the "odd" array. If it is not, it prints "No" and exits the program. If it is, it moves on to the next character. The same process is repeated for the "even" array. If all characters pass this check, it prints "Yes".
