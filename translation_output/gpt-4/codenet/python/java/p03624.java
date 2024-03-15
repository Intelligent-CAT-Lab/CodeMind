Here is the translated Java code for the given Python script:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> s = new ArrayList<>();
        for (char c : input.toCharArray()) {
            s.add(c);
        }

        Set<Character> s2Set = new HashSet<>(s);
        List<Character> s3 = new ArrayList<>(s2Set);
        s3.sort(Character::compare);

        List<Character> s4 = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        
        if (s3.equals(s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (!s3.get(i).equals(s4.get(i))) {
                    System.out.println(s4.get(i));
                    break;
                }
                if (i == s3.size() - 1) {
                    System.out.println(s4.get(i + 1));
                }
            }
        }
        scanner.close();
    }
}
```

Please note the following: 
1. The Python `input()` function was replaced with `Scanner.nextLine()` to read input from the user.
2. The `HashSet` and `ArrayList` collections in Java are used to mimic the behavior of Python sets and lists.
3. The `Character::compare` comparator method is used to sort the characters in the `ArrayList`.
4. Checking for list equality is done using `List.equals()` method.

Make sure that when you run this Java program, you have the `import java.util.*` statement to include the necessary classes from the Java Collections framework.
