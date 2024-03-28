Here is the translated code from Python to Java which performs the same functionality as the provided Python code:

```java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^A?KIHA?BA?RA?$";
        
        // Reading the input from the user
        String S = scanner.next(); 

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(S);
        
        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

To run the test case `KIHBR` with `YES` as the expected output, you would need to execute the above Java program and input `KIHBR` when prompted for input.
