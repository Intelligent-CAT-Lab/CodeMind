Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int l = a.length();
        int i = 0;
        int ans = 0;
        while (i < l) {
            int lenj = 0, leno = 0, leni = 0;
            while (i < l && a.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < l && a.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < l && a.charAt(i) == 'I') {
                leni++;
                i++;
            }
            if (lenj >= leno && leni >= leno) {
                ans = Math.max(ans, leno);
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates through the string, counting the number of 'J', 'O', and 'I' characters in a row. If it finds a sequence of 'J', 'O', and 'I' characters where 'J' is at least as long as 'O' and 'I', it updates the maximum length of 'O' it has found so far. Finally, it prints out the maximum length of 'O' it found.
