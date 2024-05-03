Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> D = new HashMap<>();
        while (scanner.hasNextLine()) {
            String S = scanner.nextLine();
            for (char s : S.toCharArray()) {
                if (Character.isLetter(s)) {
                    D.put(Character.toLowerCase(s), D.getOrDefault(Character.toLowerCase(s), 0) + 1);
                }
            }
        }

        for (char s : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
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

This Java code does the same thing as your Python code. It reads lines from the standard input, converts each line to lowercase, and counts the occurrences of each letter. It then prints out the counts for each letter.
