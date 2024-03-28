import java.util.*;
public class p00280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int y = sc.nextInt();
        Set<String> possible = new HashSet<>();
        dfs(possible, "", j, y);
        System.out.println();
        for (String game : possible) {
            if (game.length() == j + y) {
                System.out.println(game);
            }
        }
    }

    private static void dfs(Set<String> possible, String game, int j, int y) {
        if (game.length() == j + y) {
            possible.add(game);
            return;
        }
        if (game.length() > j + y) {
            return;
        }
        if (game.length() == j) {
            dfs(possible, game + "B", j, y);
        } else if (game.length() == y) {
            dfs(possible, game + "A", j, y);
        } else {
            dfs(possible, game + "A", j, y);
            dfs(possible, game + "B", j, y);
        }
    }
}