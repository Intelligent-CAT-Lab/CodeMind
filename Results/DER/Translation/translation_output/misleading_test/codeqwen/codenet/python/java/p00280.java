Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static Set<String> possible = new HashSet<>();

    public static void dfs(String game) {
        int a = 0, b = 0;
        for (char c : game.toCharArray()) {
            if (c == 'A') a++;
            else b++;
        }
        if ((a == 5 && b < 4 || a < 4 && b == 5 || a == b && a == 5 || 
                a == 6 && b == 4 || a == 4 && b == 6)) {
            possible.add(game);
        } else if ((Math.max(a, b) <= 4 || a == b && a == 4 || a == 5 && b == 4 || a == 4 && b == 5)) {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(game + "A");
            if (!possible.contains(game + "B")) dfs(game + "B");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        dfs("");
        List<String> ans = new ArrayList<>();
        for (String game : possible) {
            if ((game.chars().filter(ch -> ch == 'A').count(), game.chars().filter(ch -> ch == 'B').count()) == (j, y)) {
                ans.add(game);
            }
        }
        Collections.sort(ans);
        for (String game : ans) {
            System.out.println(game);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, generates all possible strings of length 2n (where n is the input integers), and checks if each string is valid according to the rules. If a string is valid, it is added to the set of possible strings. Finally, it
