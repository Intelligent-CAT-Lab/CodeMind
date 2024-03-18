```java
import java.util.Scanner;

public class AZDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int aIndex = 0;
        int zIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aIndex = i;
                break;
            }
        }

        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == 'Z') {
                zIndex = i;
                break;
            }
        }

        System.out.println(zIndex - aIndex + 1);
    }
}
```
```
