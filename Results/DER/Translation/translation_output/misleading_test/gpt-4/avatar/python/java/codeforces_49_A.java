Below is the Python code translated into Java:

```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        char letter = '\0';
        
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
            System.out.println("NO" + Character.toUpperCase(letter));
        }

        scanner.close();
    }
}
```

Make sure to note that in Java, unlike Python, strings are immutable, and the character data type is represented by `char` rather than `str`. The `HashSet` structure is used here to store vowel characters for easy lookup. A `Scanner` object is used to read the input from the user. Please also pay attention to properly closing the `Scanner` at the end to avoid a resource leak warning in some Java versions or static analysis tools.

In the original Python code, `' ▁ '` seems to be an unusual character. In the Java translation, I have maintained the character as `'▁'` assuming it is intentional, but if it was meant to be a space (' '), please replace `'▁'` with `' '` in the Java code.

Also, the condition checks for the character `?`, which seems to be intentional. However, you should ensure it's the right character to be checking against in your original code, as it may just be a placeholder for end-of-line or some other delimiter in context.
