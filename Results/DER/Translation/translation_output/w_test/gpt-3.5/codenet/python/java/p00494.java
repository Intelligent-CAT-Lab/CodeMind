```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
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
```
