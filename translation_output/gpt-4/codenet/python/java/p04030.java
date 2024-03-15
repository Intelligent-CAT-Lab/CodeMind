Here is the equivalent Java code for the provided Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder a = new StringBuilder();

        for (char i : s.toCharArray()) {
            if (i == 'B') {
                if (a.length() > 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(i);
            }
        }

        System.out.println(a.toString());
        scanner.close();
    }
}
```

This Java code uses `StringBuilder` to efficiently handle the modification of the string `a`. The `a.length() > 0` check ensures that we do not attempt to delete a character from an empty `StringBuilder`, which mirrors the functionality of the Python code by checking `not(a == "")`.
