System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
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
```<|endoftext|>
