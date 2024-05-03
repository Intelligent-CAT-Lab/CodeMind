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

This Java code does the same thing as your Python code. It reads a string from the user, then it checks each character from both ends of the string. If the characters are the same, it moves the pointers one step towards the center. If the characters are different, it checks if one of them is 'x'. If it is, it moves the pointer that is not 'x' one step towards the center. If neither of them is 'x', it prints "-1" and exits the program. Finally, it prints the number of 'x's that were skipped.
