<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
AABB
ABAB
ABBA
BAAB
BABA

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
[/INST]
```java
import java.util.*;

public class DFS {
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
```</s>
