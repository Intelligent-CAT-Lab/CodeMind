Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String odd = "RUD";
        String even = "LUD";

        for (int i = 0; i < s.length(); i += 2) {
            if (odd.indexOf(s.charAt(i)) == -1) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (even.indexOf(s.charAt(j)) == -1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks every other character starting from the first one (index 0) to see if it is in the string "RUD". If it is not, it prints "No" and exits the program. If it is, it moves on to the next character. The same process is repeated for every other character starting from the second one (index 1). If all characters are in the correct string, it prints "Yes".
