Here is the equivalent Java code that performs the same functionality as the provided Python code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static Set<String> possible = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        dfs("");
        
        List<String> ans = new ArrayList<>();
        for (String game : possible) {
            if (countChar(game, 'A') == j && countChar(game, 'B') == y) {
                ans.add(game);
            }
        }

        Collections.sort(ans);
        for (String game : ans) {
            System.out.println(game);
        }
    }

    private static void dfs(String game) {
        int a = countChar(game, 'A');
        int b = countChar(game, 'B');
        if ((a == 5 && b < 4) || (a < 4 && b == 5) || (a == b && a == 5) ||
                (a == 6 && b == 4) || (a == 4 && b == 6)) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || (a == b && a == 4) || (a == 5 && b == 4) || (a == 4 && b == 5)) {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(game + "A");
            if (!possible.contains(game + "B")) dfs(game + "B");
        }
    }

    private static int countChar(String game, char c) {
        int count = 0;
        for (int i = 0; i < game.length(); i++) {
            if (game.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This code should be compiled and run in a Java environment. It reads input from the console (system.in), generates all possible game outcomes, and then filters and sorts them based on the criteria provided in the input. Note that in Java, we use a Scanner object to read input, and we explicitly close the scanner when we're done with it. Additionally, we manage a list to store the answers and use Collections.sort to sort them alphabetically before printing the results.
