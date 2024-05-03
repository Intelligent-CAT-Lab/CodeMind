Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a_index = 0;
        int z_index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a_index = i;
                break;
            }
        }
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == 'Z') {
                z_index = i;
                break;
            }
        }
        System.out.println(z_index - a_index + 1);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, finds the index of the first 'A' character and the last 'Z' character, and then prints the difference between these two indices plus one.
