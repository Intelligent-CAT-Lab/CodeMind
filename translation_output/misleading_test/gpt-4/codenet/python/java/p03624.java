Below is the translated Java code for the given Python script. Please note that Java's input handling is quite different from Python's, and so a `Scanner` object has been used to read input from the console.

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MissingAlphabetFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        
        Set<Character> characterSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            characterSet.add(c);
        }
        
        List<Character> s3 = new ArrayList<>(characterSet);
        Collections.sort(s3);
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        if (s3.size() == alphabet.length()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (s3.get(i) != alphabet.charAt(i)) {
                    System.out.println(alphabet.charAt(i));
                    break;
                }
                if (i == s3.size() - 1) {
                    System.out.println(alphabet.charAt(i + 1));
                }
            }
        }
    }
}
```
To utilize this code, compile it with `javac` and run it using `java`, providing the input data as you would through a command-line interface. This Java code mimics the logic of the original Python code by finding the first missing lowercase letter of the English alphabet from the input string.
