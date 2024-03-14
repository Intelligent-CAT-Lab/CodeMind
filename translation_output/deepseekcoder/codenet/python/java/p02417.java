<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
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


```

### Response:
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            for (char c : s.toCharArray()) {
                if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                    char lowerCase = Character.toLowerCase(c);
                    map.put(lowerCase, map.getOrDefault(lowerCase, 0) + 1);
                }
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + ": " + map.getOrDefault(c, 0) + "\n");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads input from the user, counts the occurrences of each letter (case-insensitive), and then prints out the counts for each letter. The `HashMap` in Java is used to store the counts. The `Scanner` class is used to read the input. The `hasNext()` method checks if there is another line of input, and the `next()` method reads the next line. The `getOrDefault()` method is used to get the count for a letter, and if the letter is not in the map, it returns 0. The `Character.toLowerCase()` method is used to convert a character to lowercase.
<|EOT|>
