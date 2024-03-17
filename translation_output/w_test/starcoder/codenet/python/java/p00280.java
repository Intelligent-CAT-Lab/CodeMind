<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
AABB
ABAB
ABBA
BAAB
BABA
BBAA


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
```
import java.util.*;
public class Main {
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
```
'''
<|endoftext|>
