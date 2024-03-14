<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def dfs(game):
    a,b = game.count("A"),game.count("B")
    if  (a == 5 and b < 4 or a < 4 and b == 5 or a == b == 5 or 
            a == 6 and b == 4 or a == 4 and b == 6):
        possible.add(game)
    elif (max(a,b) <= 4 or a == b == 4 or a == 5 and b == 4 or a == 4 and b == 5):
        possible.add(game)
        if game+"A" not in possible: dfs(game+"A")
        if game+"B" not in possible: dfs(game+"B")
            
j,y = map(int,raw_input().split())
possible = set([])
dfs("")
ans = []
for game in possible:
    if (game.count("A"),game.count("B")) == (j,y): ans.append(game)
print  "\n".join(sorted(ans))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
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
```
<|endoftext|>
