Below is the translated Java code:

```java
import java.util.Scanner;

public class ConvertTextCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        StringBuilder out = new StringBuilder(" ");
        int cap = 0;
        int small = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (Character.isLowerCase(txt.charAt(i))) {
                small++;
            } else {
                cap++;
            }
        }

        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                out.append(Character.toLowerCase(txt.charAt(i)));
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                out.append(Character.toUpperCase(txt.charAt(i)));
            }
        }

        System.out.println(out.toString());
        scanner.close();
    }
}
```

To use this Java program, you would compile and run it using a Java compiler or interpreter. It will wait for user input from the console, so you can type in your test input and then press Enter to see the expected output.
