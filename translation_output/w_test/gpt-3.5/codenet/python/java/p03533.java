```java
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^A?KIHA?BA?RA?$";
        String S = scanner.next();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(S);

        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
