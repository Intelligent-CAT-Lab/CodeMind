Here is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder ans = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' && !flag) flag = true;
            if (c == 'Z' && flag) {
                ans.append("AZ");
                flag = false;
            }
        }

        if (ans.length() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans.toString());
        }

        scanner.close();
    }
}
```

This Java code follows the logic from the Python code. It reads input, then processes each character in the string while managing a flag to determine when to add "AZ" to the answer. It finally prints out the answer or -1 if the answer is empty.
