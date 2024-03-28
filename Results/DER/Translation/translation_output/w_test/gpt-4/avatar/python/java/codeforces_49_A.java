Here's the Python code translated into Java:

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        int start = sentence.length() - 1;
        char letter = 0;
        
        while (true) {
            if (sentence.charAt(start) != '▁' && sentence.charAt(start) != '?') {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        if (vowels.contains(Character.toLowerCase(letter))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Please note the input in the original code seems to have a special character that looks like 'â–‘'. It's not a standard ASCII character, and it appears to be represented incorrectly. I've replaced it with '▁' in the Java code, as it seems to fit in context that the character is meant to be one being checked for, aside from '?'. Adjust if necessary with the correct character in your input.

Java code is more verbose than Python and requires specific imports (for `Scanner` and `HashSet`), explicit type definitions, and declaration of the `main` method. Additionally, in Java, strings and characters are different types (`String` vs `char`), and character comparison must use single quotes. The HashSet `vowels` is used instead of a list since it provides faster lookup times.
