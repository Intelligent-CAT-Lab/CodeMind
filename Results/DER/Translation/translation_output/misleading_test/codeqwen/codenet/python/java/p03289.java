Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int flag = 0;
        if (S.charAt(0) != 'A') {
            flag = 1;
        }

        int count = 0;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                count += 1;
            }
        }
        if (count != 1) {
            flag = 1;
        }

        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) {
                count2 += 1;
            }
        }
        if (count2 != 2) {
            flag = 1;
        }

        if (flag == 0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the first character is 'A', counts the number of 'C' characters in the string, and counts the number of uppercase characters in the string. If any of these conditions are not met, it sets the flag to 1. Finally, it prints "AC" if the flag is 0, otherwise it prints "WA".
