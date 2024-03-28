Here's the Java translation of your provided Python code:

```java
import java.util.Scanner;

public class IsogramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean isIsogram = true;

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
                isIsogram = false;
                break;
            }
        }
        
        if (isIsogram) {
            System.out.println("yes");
        }

        scanner.close();
    }
}
```

In this Java code, I'm using a `Scanner` to read the input from the user, then I check each character to count how often it appears in the given string. If a character appears more than once, "no" is printed out, and the loop breaks. If no characters repeat, "yes" is printed after the loop completes.
