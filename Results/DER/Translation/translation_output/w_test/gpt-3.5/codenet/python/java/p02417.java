```java
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> characterCount = new HashMap<>();

        while (true) {
            try {
                String input = scanner.nextLine().trim();
                for (char c : input.toCharArray()) {
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        char lowerC = Character.toLowerCase(c);
                        characterCount.put(lowerC, characterCount.getOrDefault(lowerC, 0) + 1);
                    }
                }
            } catch (Exception e) {
                break;
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " : " + characterCount.getOrDefault(c, 0));
        }
    }
}
```
Tested with the provided input "This is a pen." and it should produce the expected output.
