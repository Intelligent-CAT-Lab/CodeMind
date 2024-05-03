Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        StringBuilder log = new StringBuilder();
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replace("ABC", "A");
                log.append("A");
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replace("ABC", "C");
                log.append("C");
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log.append("B");
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        int l = log.length();
        for (int i = 0; i < l; i++) {
            s = s.replace(log.charAt(l - 1 - i), 'A');
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

Please note that in Java, we use `substring` method to get a part of a string, and `contains` method to check if a string contains a substring. Also, `charAt` method is used to get a character at a specific index in a string.
