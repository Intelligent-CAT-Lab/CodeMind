import java.util.*;

public class p00280 {
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
        } else if ((max(a, b) <= 4 || a == b && a == 4 || a == 5 && b == 4 || a == 4 && b == 5)) {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(game + "A");
            if (!possible.contains(game + "B")) dfs(game + "B");
        }
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        dfs("");
        List<String> ans = new ArrayList<>();
        for (String game : possible) {
            if ((game.length() == 2 && game.charAt(0) == 'A' && game.charAt(1) == 'B') || 
                    (game.length() == 2 && game.charAt(0) == 'B' && game.charAt(1) == 'A') || 
                    (game.length() == 3 && game.charAt(0) == 'A' && game.charAt(1) == 'A' && game.charAt(2) == 'B') || 
                    (game.length() == 3 && game.charAt(0