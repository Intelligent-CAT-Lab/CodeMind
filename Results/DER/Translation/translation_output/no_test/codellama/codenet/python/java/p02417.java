<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A = []
while True:
    try:
        S = input()
        for s in S:
            if 'a' <= s <= 'z' or 'A' <= s <= 'Z':
                A.append(s.lower())
    except EOFError:
        break

D = {}
for s in A:
    if s in D:
        D[s] += 1
    else:
        D[s] = 1

Str = [chr(i) for i in range(97, 97+26)]
for s in Str:
    print(s, end=" ")
    print(":", end=" ")
    if s in D:
        print(D[s])
    else:
        print(0)



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> letterCount = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCount.put(Character.toLowerCase(c), letterCount.getOrDefault(Character.toLowerCase(c), 0) + 1);
                }
            }
        }

        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            System.out.print(c + ": ");
            if (letterCount.containsKey(c)) {
                System.out.println(letterCount.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `HashMap` class to store the letter counts. The `Character.isLetter()` method is used to check if a character is a letter, and the `Character.toLowerCase()` method is used to convert the character to lowercase. The `getOrDefault()` method is used to get the value of a key in the map, or a default value if the key is not present. Finally, the `containsKey()` method is used to check if a key is present in the map, and the `get()` method is used to get the value of a key if it is present.</s>
