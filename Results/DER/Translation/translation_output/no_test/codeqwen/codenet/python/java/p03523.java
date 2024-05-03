Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String S = System.console().readLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = Arrays.stream(S.replace("A", "").split(""))
                    .collect(Collectors.groupingBy(s -> s))
                    .values().stream()
                    .map(List::size)
                    .collect(Collectors.toList());
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= L.stream().allMatch(l -> l <= X[L.indexOf(l)]);
        }
        System.out.println(b ? "YES" : "NO");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the console, checks if the string after removing all "A"s equals "KIHBR", if it does, it splits the string into groups of consecutive identical characters, counts the number of characters in each group, and checks if all counts are less than or equal to the corresponding value in the array X. If all these conditions are met, it prints "YES", otherwise it prints "NO".
