Here is the Java version of your Python code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println(1 + " " + 2);
            } else {
                System.out.println(-1 + " " + -1);
            }
            return;
        }

        for (int i = 0; i < S.length() - 3; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                set.add(S.charAt(j));
            }
            if (set.size() <= 2) {
                System.out.println(i + 1 + " " + (i + 3));
                return;
            }
        }
        System.out.println(-1 + " " + -1);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, checks if the string length is 2, and if so, checks if the two characters are the same. If they are, it prints 1 and 2. If not, it prints -1 and -1. If the string length is not 2, it iterates over the string, checking every 3 consecutive characters for uniqueness. If it finds a set of 3 characters that are all unique, it prints the starting index of the set and the ending index of the set. If it doesn't find such a set, it prints -1 and -1.
