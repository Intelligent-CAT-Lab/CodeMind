import java.util.*;

public class p00280 {
    private static Set<String> possible = new HashSet<>();
    private static List<String> ans = new ArrayList<>();
    private static int j, y;

    private static void dfs(String game) {
        int a = (int) game.chars().filter(ch -> ch == 'A').count();
        int b = (int) game.length() - a;

        if ((a == 5 && b < 4 || a < 4 && b == 5 || a == b && a == 5) ||
                (Math.max(a, b) <= 4 || a == b && a == 4 || a == 5 && b == 4 || a == 4 && b == 5)) {
            possible.add(game);
        }

        if ((game + "A").chars().noneMatch(ch -> ch == 'A')) {
            dfs(game + "A");
        }

        if ((game + "B").chars().noneMatch(ch -> ch == 'B')) {
            dfs(game + "B");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        j = scanner.nextInt();
        y = scanner.nextInt();
        dfs("");

        for (String game : possible) {
            int a = (int) game.chars().filter(ch -> ch == 'A').count();
            int b = (int) game.length() - a;
            if (a == j && b == y) {
                ans.add(game);
            }
        }

        Collections.sort(ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }
}