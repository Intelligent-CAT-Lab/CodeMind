Here's the Java equivalent of your provided Python code:

```java
import java.util.Scanner;

public class CharacterReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String w = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                sb.append('Z');
            } else if (c == 'B') {
                sb.append('Y');
            } else if (c == 'A') {
                sb.append('X');
            } else {
                char shifted = (char) (c - 3);
                sb.append(shifted);
            }
        }

        String l = sb.toString();
        System.out.println(l);
        
        scanner.close();
    }
}
```

This Java code imports the `Scanner` class for user input, uses a `StringBuilder` to efficiently construct the output string character by character, and outputs the transformed string to the console. Remember that in Java, the `char` datatype is used for storing single characters, which simplifies the process of manipulating individual characters compared to Python.
