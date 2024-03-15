```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        char letter = '\0';
        while (true) {
            if (sentence.charAt(start) != ' ' && sentence.charAt(start) != '?') {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        if (vowels.contains(Character.toLowerCase(letter))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

Note: The Python sample you've provided has a few seemingly incorrect characters. The 'â' does not correspond to a typical whitespace character, so I replaced it with regular spaces in the Java translation. Additionally, the provided Python code had spaces within the quotation marks for single characters, which might be causing syntax issues. I've made a couple of adjustments considering these points. Depending on the true intent of your Python code and the nature of the characters, further adjustments might be needed.
