Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
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
```<|endoftext|>
