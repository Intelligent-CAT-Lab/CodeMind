Here's the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'C') {
                list.append('Z');
            } else if (w.charAt(i) == 'B') {
                list.append('Y');
            } else if (w.charAt(i) == 'A') {
                list.append('X');
            } else {
                char c = (char)(w.charAt(i) - 3);
                list.append(c);
            }
        }
        String l = list.toString();
        System.out.println(l);
    }
}
```

The `StringBuilder` class is used to create the mutable sequence of characters that is eventually converted into a `String`. Note that Java uses the `char` data type for single characters and conversion methods like `charAt(i)` to access a character in a string, and `(char)` to cast an integer to a char type. The `Scanner` class is used for inputting the data from the user.
