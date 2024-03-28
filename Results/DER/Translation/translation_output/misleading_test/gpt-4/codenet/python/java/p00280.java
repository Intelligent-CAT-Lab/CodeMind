Here is the equivalent Java code for the Python code provided:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasketballGames {

    private static Set<String> possible = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        dfs("");

        List<String> ans = new ArrayList<>();
        for (String game : possible) {
            if ((countOccurrences(game, 'A') == j) && (countOccurrences(game, 'B') == y)) {
                ans.add(game);
            }
        }

        Collections.sort(ans);
        for (String game : ans) {
            System.out.println(game);
        }
    }

    public static void dfs(String game) {
        int a = countOccurrences(game, 'A');
        int b = countOccurrences(game, 'B');

        boolean condition1 = (a == 5 && b < 4) || (a < 4 && b == 5) || (a == b && b == 5) || (a == 6 && b == 4) || (a == 4 && b == 6);
        boolean condition2 = (Math.max(a, b) <= 4) || (a == b && b == 4) || (a == 5 && b == 4) || (a == 4 && b == 5);

        if (condition1 || condition2) {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(game + "A");
            if (!possible.contains(game + "B")) dfs(game + "B");
        }
    }

    public static int countOccurrences(String str, char charToCount) {
        return (int) str.chars().filter(ch -> ch == charToCount).count();
    }
}
```

This Java code performs the same operations as the provided Python code. It finds all permutations of basketball game sequences with 'A' and 'B' under certain conditions. It then prints out the sorted game sequences that have the correct count of 'A' and 'B', as specified by the user input `j` and `y`.
