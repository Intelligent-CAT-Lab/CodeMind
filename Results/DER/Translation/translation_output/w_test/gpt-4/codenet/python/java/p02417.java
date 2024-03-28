Here is the Python code translated to Java. I have encapsulated the logic inside a `main` method.

```java
import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (char ch : line.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char lowerCh = Character.toLowerCase(ch);
                    frequencyMap.put(lowerCh, frequencyMap.getOrDefault(lowerCh, 0) + 1);
                }
            }
        }
        
        scanner.close();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.printf("%c : %d%n", ch, frequencyMap.getOrDefault(ch, 0));
        }
    }
}
```

This program will read input from the console until there's no more input (EOF), similar to the Python code. It processes each character of the input string, maps them to lowercase, and keeps a count in `frequencyMap`. After the input is processed, it then prints out the frequency of each letter from 'a' to 'z'. Note that Java programs typically require a `Scanner` object to read from `System.in` and handle input in a similar fashion to Python's `input()` function.

To run it as a test with the input example "This is a pen.", you'll have to provide the input to the program and signal the end-of-input depending on your operating system. For example, in Unix-like systems, it might be Ctrl+D, and in Windows, it might be Ctrl+Z.
