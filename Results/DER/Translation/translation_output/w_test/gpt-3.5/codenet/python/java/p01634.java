```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        if (a.length() < 6) {
            System.out.println("INVALID");
        } else {
            int m = 0;
            int n = 0;
            int l = 0;
            for (int i = 0; i < a.length(); i++) {
                if (48 <= (int) a.charAt(i) && (int) a.charAt(i) <= 57) {
                    m += 1;
                }
                if (97 <= (int) a.charAt(i) && (int) a.charAt(i) <= 122) {
                    n += 1;
                }
                if (65 <= (int) a.charAt(i) && (int) a.charAt(i) <= 90) {
                    l += 1;
                }
            }
            if (m == 0 || n == 0 || l == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");
            }
        }
    }
}
```
```
