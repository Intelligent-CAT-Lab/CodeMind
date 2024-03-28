Sure, here is the equivalent Java code for the Python snippet you've provided:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashMap<Character, Integer> dic = new HashMap<>();
        dic.put('a', 0);
        dic.put('b', 0);
        dic.put('c', 0);

        for (char c : s.toCharArray()) {
            dic.put(c, dic.get(c) + 1);
        }

        int a = dic.get('a');
        int b = dic.get('b');
        int c = dic.get('c');

        String output = (Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a))) <= 1) ? "YES" : "NO";
        System.out.println(output);
        scanner.close();
    }
}
```

To use this Java program, simply compile it and run it. When prompted, enter the test input (e.g., `abac`), and the program will produce the expected output (`YES`).
