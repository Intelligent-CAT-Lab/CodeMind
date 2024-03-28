Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder a = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'B') {
                if (a.length() != 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(currentChar);
            }
        }
        
        System.out.println(a.toString());
        scanner.close();
    }
}
```

To test this Java code with the input provided ("01B0"), it would print "00" as expected, given that the 'B' in the input string should erase the preceding character '1'.
