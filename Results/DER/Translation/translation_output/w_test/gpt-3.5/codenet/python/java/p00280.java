```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    static Set<String> possible = new HashSet<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        
        dfs("");

        Set<String> ans = new TreeSet<>();
        for (String game : possible) {
            if (countChars(game, 'A') == j && countChars(game, 'B') == y) {
                ans.add(game);
            }
        }

        for (String result : ans) {
            System.out.println(result);
        }
    }

    static void dfs(String game) {
        int a = countChars(game, 'A');
        int b = countChars(game, 'B');

        if ((a == 5 && b < 4) || (a < 4 && b == 5) || (a == b && a == 5) ||
                (a == 6 && b == 4) || (a == 4 && b == 6)) {
            possible.add(game);
        } else if ((Math.max(a, b) <= 4) || (a == b && a == 4) || (a == 5 && b == 4) || (a == 4 && b == 5)) {
            possible.add(game);
            if (!possible.contains(game + "A")) {
                dfs(game + "A");
            }
            if (!possible.contains(game + "B")) {
                dfs(game + "B");
            }
        }
    }

    static int countChars(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}
```

