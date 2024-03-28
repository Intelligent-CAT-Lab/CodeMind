import java.util.*;

public class p00280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int y = sc.nextInt();
        Set<String> possible = new HashSet<>();
        dfs(possible, "", j, y);
        System.out.println("\n".join(new ArrayList<>(possible)));
    }
    
    public static void dfs(Set<String> possible, String game, int j, int y) {
        int a = game.length() - game.replace("A", "").length();
        int b = game.length() - game.replace("B", "").length();
        if ((a == 5 && b < 4 || a < 4 && b == 5 || a == b == 5 || 
                a == 6 && b == 4 || a == 4 && b == 6) && game.length() == 10) {
            possible.add(game);
        } else if ((max(a,b) <= 4 || a == b == 4 || a == 5 && b == 4 || a == 4 && b == 5) && game.length() <= 10) {
            possible.add(game);
            if (game + "A"!= null &&!possible.contains(game + "A")) dfs(possible, game + "A", j, y);
            if (game + "B"!= null &&!possible.contains(game + "B")) dfs(possible, game + "B", j, y);
        }
    }
    
    public static int max(int a, int b) {
        return a > b? a : b;
    }
}