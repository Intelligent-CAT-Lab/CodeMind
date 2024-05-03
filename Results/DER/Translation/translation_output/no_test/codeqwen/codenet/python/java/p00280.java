Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static Set<String> possible = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        dfs("");
        List<String> ans = new ArrayList<>();
        for (String game : possible) {
            if (game.chars().filter(ch -> ch == 'A').count() == j && game.chars().filter(ch -> ch == 'B').count() == y) {
                ans.add(game);
            }
        }
        Collections.sort(ans);
        for (String game : ans) {
            System.out.println(game);
        }
    }

    static void dfs(String game) {
        int a = (int) game.chars().filter(ch -> ch == 'A').count();
        int b = (int) game.chars().filter(ch -> ch == 'B').count();
        if ((a == 5 && b < 4 || a < 4 && b == 5 || a == b && a == 5 || 
                a == 6 && b == 4 || a == 4 && b == 6)) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || a == b && a == 4 || a == 5 && b == 4 || a == 4 && b == 5) {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(game + "A");
            if (!possible.contains(game + "B")) dfs(game + "B");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, performs a depth-first search to find all possible games, and then prints out all the games that have the specified number of A's and B's.
