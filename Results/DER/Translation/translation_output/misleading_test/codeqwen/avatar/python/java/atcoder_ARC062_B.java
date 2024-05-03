Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        System.out.println((c.get('g') - c.get('p')) / 2);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, counts the occurrences of each character in the string, and then prints the difference between the number of 'g's and 'p's, divided by 2.
