import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class p00280 {
    private static Set<String> possible = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        dfs("");

        List<String> ans = new ArrayList<>();
        for (String game : possible) {
            long countA = game.chars().filter(ch -> ch == 'A').count();
            long countB = game.chars().filter(ch -> ch == 'B').count();
            if (countA == j && countB == y) {
                ans.add(game);
            }
        }

        Collections.sort(ans);

        for (String game : ans) {
            System.out.println(game);
        }
    }

    private static void dfs(String game) {
        long a = game.chars().filter(ch -> ch == 'A').count();
        long b = game.chars().filter(ch -> ch == 'B').count();
        if ((a == 5 && b < 4) || (a < 4 && b == 5) || (a == b && a == 5) ||
            (a == 6 && b == 4) || (a == 4 && b == 6)) {
            possible.add(game);
        } else if ((Math.max(a, b) <= 4) || (a == b && a == 4) || 
                   (a == 5 && b == 4) || (a == 4 && b == 5)) {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(game + "A");
            if (!possible.contains(game + "B")) dfs(game + "B");
        }
    }
}