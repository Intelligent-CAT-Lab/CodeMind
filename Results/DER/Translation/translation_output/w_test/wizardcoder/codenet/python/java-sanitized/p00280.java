import java.util.*;

public class p00280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int y = sc.nextInt();
        Set<String> possible = new HashSet<>();
        dfs(possible, "", j, y);
        List<String> ans = new ArrayList<>(possible);
        Collections.sort(ans);
        System.out.println("\n".join(ans));
    }
    
    public static void dfs(Set<String> possible, String game, int j, int y) {
        int a = game.length() - game.replace("A", "").length();
        int b = game.length() - game.replace("B", "").length();
        if (a == 5 && b < 4 || a < 4 && b == 5 || a == b == 5 || 
                a == 6 && b == 4 || a == 4 && b == 6) {
            possible.add(game);
        } else if (Math.max(a, b) <= 4 || a == b == 4 || a == 5 && b == 4 || a == 4 && b == 5) {
            possible.add(game);
            if (!possible.contains(game + "A")) dfs(possible, game + "A", j, y);
            if (!possible.contains(game + "B")) dfs(possible, game + "B", j, y);
        }
    }
}