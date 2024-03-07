import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class p00280 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        Set<String> possible = new HashSet<>();
        dfs("", possible);
        String[] ans = new String[possible.size()];
        int i = 0;
        for (String game : possible) {
            if (game.split("A").length == j && game.split("B").length == y) {
                ans[i++] = game;
            }
        }
        System.out.println(String.join("\n", ans));
    }

    private static void dfs(String game, Set<String> possible) {
        int a = game.split("A").length;
        int b = game.split("B").length;
        if (a == 5 && b < 4 || a < 4 && b == 5 || a == b == 5 || a == 6 && b == 4 || a == 4 && b == 6) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || a == b == 4 || a == 5 && b == 4 || a == 4 && b == 5) {
            possible.add(game);
            if (!game.contains("A")) {
                dfs(game + "A", possible);
            }
            if (!game.contains("B")) {
                dfs(game + "B", possible);
            }
        }
    }
}