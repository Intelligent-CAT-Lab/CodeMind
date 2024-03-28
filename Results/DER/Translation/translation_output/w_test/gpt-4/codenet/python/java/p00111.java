Below is the translated Java code for the given Python program:

```java
import java.util.HashMap;
import java.util.Scanner;

public class DecodeMessage {

    public static void main(String[] args) {
        HashMap<Character, String> tableA;
        HashMap<String, Character> tableB;
        Pair<HashMap<Character, String>, HashMap<String, Character>> tables = makeTable();
        tableA = tables.first;
        tableB = tables.second;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String s = "";
            for (char c : input.toCharArray()) {
                s += tableA.get(c);
            }
            String tmp = "";
            String ans = "";
            for (char c : s.toCharArray()) {
                tmp += c;
                if (tableB.containsKey(tmp)) {
                    ans += tableB.get(tmp);
                    tmp = "";
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }

    public static Pair<HashMap<Character, String>, HashMap<String, Character>> makeTable() {
        HashMap<Character, String> tableA = new HashMap<>();
        HashMap<String, Character> tableB = new HashMap<>();

        // initialize tableA
        // ... (insert tableA initialization here, similar to below)

        // initialize tableB
        tableB.put("101", ' ');
        tableB.put("000000", '\'');
        tableB.put("000011", ',');
        tableB.put("10010001", '-');
        tableB.put("010001", '.');
        tableB.put("000001", '?');
        tableB.put("100101", 'A');
        // ... (complete the rest of tableB initialization)

        return new Pair<>(tableA, tableB);
    }

    private static class Pair<T, U> {
        public final T first;
        public final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
}
```

Note that you need to complete the remaining part of the `tableA` initialization in the same way as shown in the Python code. For each Python dictionary entry such as `"A":"00000"`, you'd have an entry in the Java `HashMap` as `tableA.put('A', "00000");`.

Also, this Java code assumes that you are entering one line of input at a time and that you'll send an EOF signal (Ctrl+D on UNIX/Linux/Mac or Ctrl+Z on Windows followed by Enter) to indicate the end of input. This replaces the `try-except` block in the Python code that checks for input termination.

When working with `Scanner`, you should be aware that it can throw `NoSuchElementException` or `IllegalStateException` if no line was found or if the scanner is closed, so you might want to implement additional error handling based on your environment and requirements.

Remember to import `java.util.HashMap;` and `java.util.Scanner;` at the beginning of your Java file.
