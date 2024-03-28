```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            if (!isInArray(s.substring(i, i + 1), odd)) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!isInArray(s.substring(j, j + 1), even)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static boolean isInArray(String target, String[] arr) {
        for (String s : arr) {
            if (s.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
```
