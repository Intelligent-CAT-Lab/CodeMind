Certainly! Below is the Java translation of the provided Python code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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

        String result = (Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a))) <= 1) ? "YES" : "NO";
        System.out.println(result);

        scanner.close();
    }
}
```

This Java code has the same functionality as the Python code. It reads a line from the standard input, counts the occurrences of letters 'a', 'b', and 'c' in the provided string, and then determines whether the maximum absolute difference between any two counts is less than or equal to 1. If that condition is true, it prints "YES"; otherwise, it prints "NO".
