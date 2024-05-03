Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        while(true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                if (S.charAt(i) == 'x') {
                    i += 1;
                    c += 1;
                } else if (S.charAt(j) == 'x') {
                    j -= 1;
                    c += 1;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then checks each character from both ends of the string. If the characters are the same, it moves the pointers inward. If they are not, it checks if the character at the current position is an 'x'. If it is, it moves the pointer inward and increments the counter. If the character at the other position is an 'x', it does the same. If neither of these conditions are met, it prints '-1' and exits the program. Finally, it prints the counter.
