Here's the translated Java code:

```java
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char member = s.charAt(i);
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                char member2 = s.charAt(j);
                if (member2 == member) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
        scanner.close();
    }
}
```

Please note, in the original Python code, the outer loop has no effect on the end result because `count` is always reset to 0 for each member of the string `s`. This means it checks the uniqueness of only the last character. If that is intended, the Java code above replicates this behavior. However, if the intention is to check if all characters are unique, then the Java code would need to be adjusted accordingly.
