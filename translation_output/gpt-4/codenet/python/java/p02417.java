Below is the Python code translated into Java. The translation involves reading from `System.in` and catching an exception to replicate the EOF behavior, using a `HashMap` to store the letter frequencies, and utilizing the `toLowerCase` method for character conversion:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S;
        try {
            while ((S = reader.readLine()) != null) {
                for (char s : S.toCharArray()) {
                    if (('a' <= s && s <= 'z') || ('A' <= s && s <= 'Z')) {
                        A.add(Character.toLowerCase(s));
                    }
                }
            }
        } catch (IOException e) {
            // Assuming catching IOException is equivalent to handling EOFError in Python
        }

        HashMap<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            if (D.containsKey(s)) {
                D.put(s, D.get(s) + 1);
            } else {
                D.put(s, 1);
            }
        }

        for (int i = 97; i < 97 + 26; i++) {
            char s = (char) i;
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

Make sure you import the necessary classes at the beginning of your Java file. In this case, `BufferedReader`, `IOException`, and `InputStreamReader` are used for reading the input, `ArrayList` for storing the characters, and `HashMap` for storing the frequency of each character. The `try` block is used to read lines of input until an exception (typically end-of-file in this context) occurs. Then, we initialize a `HashMap` to count the occurrences of letters and iterate through them to print the results.
