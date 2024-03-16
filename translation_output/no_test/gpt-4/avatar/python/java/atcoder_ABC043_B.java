Below is the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (i + 1 < s.length() && s.charAt(i+1) == 'B' && s.charAt(i+2) == ' ' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
                i += 2; // skip the additional spaces after 'B'
            }
        }
        
        System.out.println(myStr.toString());
        scanner.close();
    }
}
```
Please note that I have made an assumption that the spaces surrounding `'B'` were intentional. In the Python code, `' B '` will only match if there are spaces before and after `'B'`. If the intention was to check for just the character `'B'` without spaces, then you'll need to adjust the Java code by removing the additional checks for spaces before and after `'B'` as well as incrementing `i` only by 1 instead of 2.
