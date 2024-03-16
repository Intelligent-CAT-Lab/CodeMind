```java
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^A?KIHA?BA?RA?$");
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        Matcher matcher = pattern.matcher(S);
        
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
