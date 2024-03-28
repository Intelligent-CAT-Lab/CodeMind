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
            if (game.charAt(0) == 'A' && game.charAt(1) == 'B' && game.length() == 2) {
                ans.add(game);
            }
        }
        Collections.sort(ans);
        System.out.println("\n".join(ans));
    }

    public static void dfs(String game, int a, int b, Set<String> possible) {
        int countA = game.count("A");
        int countB = game.count("B");
        if (countA == 5 && countB < 4 || countA < 4 && countB == 5 || countA == countB == 5 || countA == 6 && countB == 4 || countA == 4 && countB == 6) {
            possible.add(game);
        } else if (Math.max(countA, countB) <= 4 || countA == countB == 4 || countA == 5 && countB == 4 || countA == 4 && countB == 5) {
            possible.add(game);
            if (!possible.contains(game + "A")) {
                dfs(game + "A", countA + 1, countB, possible);
            }
            if (!possible.contains(game + "B")) {
                dfs(game + "B", countA, countB + 1, possible);
            }
        }
    }
}