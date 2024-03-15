import java.util.*;

public class p00280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int y = sc.nextInt();
        Set<String> possible = new HashSet<>();
        dfs("", j, y, possible);
        List<String> ans = new ArrayList<>();
        for (String game : possible) {
            if (game.charAt(0) == 'A' && game.charAt(1) == 'B' && game.charAt(2) == 'A' && game.charAt(3) == 'B' && game.charAt(4) == 'A' && game.charAt(5) == 'B') {
                ans.add(game);
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }

    public static void dfs(String game, int j, int y, Set<String> possible) {
        int a = game.count("A");
        int b = game.count("B");
        if (a == 5 && b < 4 || a < 4 && b == 5 || a == b == 5 || a == 6 && b == 4 || a == 4 && b == 6) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || a == b == 4 || a == 5 && b == 4 || a == 4 && b == 5) {
            possible.add(game);
            if (!possible.contains(game + "A")) {
                dfs(game + "A", j, y, possible);
            }
            if (!possible.contains(game + "B")) {
                dfs(game + "B", j, y, possible);
            }
        }
    }
}