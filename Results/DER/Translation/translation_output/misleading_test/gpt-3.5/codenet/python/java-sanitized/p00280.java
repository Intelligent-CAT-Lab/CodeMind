import java.util.HashSet;
import java.util.Set;

public class p00280 {
    public static void dfs(String game, int j, int y, Set<String> possible) {
        int a = 0, b = 0;
        for (char c : game.toCharArray()) {
            if (c == 'A') {
                a++;
            } else if (c == 'B') {
                b++;
            }
        }

        if ((a == 5 && b < 4) || (a < 4 && b == 5) || (a == b && a == 5) ||
                (a == 6 && b == 4) || (a == 4 && b == 6) ||
                (Math.max(a, b) <= 4) || (a == b && a == 4) || (a == 5 && b == 4) || (a == 4 && b == 5)) {
            possible.add(game);
        } else {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(game + "A", j, y, possible);
            if (!possible.contains(game + "B")) dfs(game + "B", j, y, possible);
        }
    }

    public static void main(String[] args) {
        int j = 2, y = 2;
        Set<String> possible = new HashSet<>();
        dfs("", j, y, possible);

        Set<String> ans = new HashSet<>();
        for (String game : possible) {
            int countA = 0, countB = 0;
            for (char c : game.toCharArray()) {
                if (c == 'A') countA++;
                else if (c == 'B') countB++;
            }
            if (countA == j && countB == y) ans.add(game);
        }

        ans.stream().sorted().forEach(System.out::println);
    }
}