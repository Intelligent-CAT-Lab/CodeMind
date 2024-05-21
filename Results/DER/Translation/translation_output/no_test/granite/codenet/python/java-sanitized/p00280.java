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
            if (countA(game) == j && countB(game) == y) {
                ans.add(game);
            }
        }
        Collections.sort(ans);
        for (String game : ans) {
            System.out.println(game);
        }
    }

    public static void dfs(String game, int j, int y, Set<String> possible) {
        int a = countA(game);
        int b = countB(game);
        if ((a == 5 && b < 4) || (a < 4 && b == 5) || (a == b && a == 5) || (a == 6 && b == 4) || (a == 4 && b == 6)) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || (a == b && a == 4) || (a == 5 && b == 4) || (a == 4 && b == 5)) {
            possible.add(game);
            if (!possible.contains(game + "A")) {
                dfs(game + "A", j, y, possible);
            }
            if (!possible.contains(game + "B")) {
                dfs(game + "B", j, y, possible);
            }
        }
    }

    public static int countA(String game) {
        int count = 0;
        for (char c : game.toCharArray()) {
            if (c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static int countB(String game) {
        int count = 0;
        for (char c : game.toCharArray()) {
            if (c == 'B') {
                count++;
            }
        }
        return count;
    }
}