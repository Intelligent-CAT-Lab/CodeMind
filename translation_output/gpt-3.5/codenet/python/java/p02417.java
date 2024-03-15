```java
import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> charCount = new HashMap<>();

        while (true) {
            try {
                String input = scanner.nextLine();
                for (char c : input.toCharArray()) {
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        char lowercaseChar = Character.toLowerCase(c);
                        if (charCount.containsKey(lowercaseChar)) {
                            int count = charCount.get(lowercaseChar);
                            charCount.put(lowercaseChar, count + 1);
                        } else {
                            charCount.put(lowercaseChar, 1);
                        }
                    }
                }
            } catch (Exception e) {
                break;
            }
        }

        for (int i = 97; i < 97 + 26; i++) {
            char c = (char) i;
            System.out.print(c + " : ");
            if (charCount.containsKey(c)) {
                System.out.println(charCount.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}

```
