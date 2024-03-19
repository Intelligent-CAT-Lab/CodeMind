import java.util.*;

public class p00280 {
    static Set<String> possible = new HashSet<>();
    static List<String> ans = new ArrayList<>();
    static int j, y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        j = scanner.nextInt();
        y = scanner.nextInt();
        dfs("");
        for (String game : possible) {
            if (countA(game) == j && countB(game) == y) {
                ans.add(game);
            }
        }
        Collections.sort(ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    static void dfs(String game) {
        int a = countA(game), b = countB(game);
        if ((a == 5 && b < 4 || a < 4 && b == 5 || a == b && a == 5 ||
                a == 6 && b == 4 || a == 4 && b == 6)) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || a == b && a == 4 || a == 5 && b == 4 || a == 4 && b == 5) {
            possible.add(game);
            if (!possible.contains(game + "A")) {
                dfs(game + "A");
            }
            if (!possible.contains(game + "B")) {
                dfs(game + "B");
            }
        }
    }

    static int countA(String game) {
        return (int) game.chars().filter(ch -> ch == 'A').count();
    }

    static int countB(String game) {
        return (int) game.chars().filter(ch -> ch == 'B').count();
    }
}