Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> D = new HashMap<>();
        while (scanner.hasNextLine()) {
            String S = scanner.nextLine();
            for (char s : S.toCharArray()) {
                if (Character.isLetter(s)) {
                    char lowerCase = Character.toLowerCase(s);
                    D.put(lowerCase, D.getOrDefault(lowerCase, 0) + 1);
                }
            }
        }

        for (char s = 'a'; s <= 'z'; s++) {
            System.out.print(s + " : ");
            if (D.containsKey(s)) {
                System.out.println(D.get(s));
            } else {
                System.out.println(0);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads lines from the standard input, converts each character to lowercase, and increments the count in the map for that character. After reading all lines, it prints out the counts for each character.
