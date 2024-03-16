Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class UniqueCharactersChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean isUnique = true;

        for (int i = 0; i < s.length(); i++) {
            char member = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                char member2 = s.charAt(j);
                if (member2 == member) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            System.out.println("yes");
        }

        scanner.close();
    }
}
```

This Java code reads a word from the standard input, then iterates through each character of the string `s` to count its occurrences. If it finds any character that appears more than once, it prints "no" and stops. If no such character is found (thus, all characters are unique), it prints "yes".
