Below is the translated code from Python to Java which performs the same operation:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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
            System.out.println(ans);
        }
        scanner.close();
    }
}
```

You can run this Java program with the provided test input to get the expected output 'AZ'.
