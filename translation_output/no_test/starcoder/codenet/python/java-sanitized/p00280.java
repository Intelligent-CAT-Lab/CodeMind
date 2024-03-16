import java.util.*;
public class p00280 {
    static Set<String> possible = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int y = sc.nextInt();
        dfs("");
        List<String> ans = new ArrayList<>();
        for(String game:possible){
            if(game.length() == j+y && game.charAt(j) == 'A' && game.charAt(y) == 'B'){
                ans.add(game);
            }
        }
        Collections.sort(ans);
        for(String game:ans) System.out.println(game);
    }
    public static void dfs(String game){
        if(game.length() == 5){
            possible.add(game);
            return;
        }
        if(game.length() == 4){
            if(game.contains("AAAA") || game.contains("BBBB")) possible.add(game);
            return;
        }
        if(game.length() == 3){
            if(game.contains("AAA") || game.contains("BBB")) possible.add(game);
            return;
        }
        if(game.length() == 2){
            if(game.contains("AA") || game.contains("BB")) possible.add(game);
            return;
        }
        if(game.length() == 1){
            if(game.contains("A") || game.contains("B")) possible.add(game);
            return;
        }
        if(game.length() == 0){
            possible.add(game);
            dfs(game+"A");
            dfs(game+"B");
        }
    }
}