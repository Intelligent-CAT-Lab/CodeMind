Below is the translated Python code into Java code. Please note that the character 'â–' is a special character, which may not be displayed correctly in all environments. Make sure to replace it with the appropriate character you intend to use.

```java
import java.util.Scanner;

public class FormatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " , . ? !";
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            s = s.replace(String.valueOf(ch), ch + " ▁"); // Replace '▁' with your special character
        }
        
        s = String.join(" ▁", s.trim().split("\\s+")); // Replace '▁' with your special character
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            s = s.replace(" ▁" + ch, String.valueOf(ch)); // Replace '▁' with your special character
        }
        
        System.out.println(s);
        scanner.close();
    }
}
```

In this Java version, I've used the `String.replace()` method to substitute characters, similarly to the Python code. The `String.split("\\s+")` is used to split the string by one or more whitespace, and then the `String.join()` method to insert the special character '▁' between the words.

Please make sure to replace the placeholder '▁' with the actual character you intend to use if you copy this code, as the character might not be interpreted correctly by the Java compiler or your code editor.
